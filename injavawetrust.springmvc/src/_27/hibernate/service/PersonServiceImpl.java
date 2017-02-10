package _27.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import _27.hibernate.dao.PersonDAOImpl;
import _27.hibernate.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAOImpl personDAOImpl;

	@Override
	@Transactional
	public void insertPerson(Person person) {
		personDAOImpl.insertPerson(person);
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		return personDAOImpl.getPersonById(id);
	}

	@Override
	@Transactional
	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	@Override
	@Transactional
	public void updatePerson(Person person) {
		personDAOImpl.updatePerson(person);
	}

	@Override
	@Transactional
	public void deletePerson(int id) {
		personDAOImpl.deletePerson(id);
	}

	public Person createPerson(String name, String surname, int birthYear) {
		Person person = new Person(name, surname, birthYear);
		return person;
	}
}
