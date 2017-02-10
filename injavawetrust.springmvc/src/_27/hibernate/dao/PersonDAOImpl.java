package _27.hibernate.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import _27.hibernate.domain.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insertPerson(Person person) {
		Session session = getCurrentSession();
		session.persist(person);
	}

	@Override
	public Person getPersonById(int id) {
		Session session = getCurrentSession();
		Person person = session.get(Person.class, id);
		return person;
	}

	@Override
	public List<Person> getAllPersons() {
		Session session = getCurrentSession();
		TypedQuery<Person> query = session.createQuery("from Person", Person.class);
		return query.getResultList();
	}

	@Override
	public void updatePerson(Person person) {
		Session session = getCurrentSession();
		session.update(person);
	}

	@Override
	public void deletePerson(int id) {
		Session session = getCurrentSession();
		Person p = (Person) session.get(Person.class, new Integer(id));
		System.out.println(p);
		if (p != null) {
			session.delete(p);
		}

	}

}
