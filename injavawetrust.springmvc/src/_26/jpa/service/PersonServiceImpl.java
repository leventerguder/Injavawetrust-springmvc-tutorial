package _26.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _26.jpa.dao.PersonDAOImpl;
import _26.jpa.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAOImpl personDAOImpl;

	public void insertPerson(Person person) {
		personDAOImpl.insertPerson(person);
	}

	public Person getPersonById(int id) {
		return personDAOImpl.getPersonById(id);
	}

	public List<Person> getAllPersons() {
		return personDAOImpl.getAllPersons();
	}

	public void updatePerson(Person person) {
		personDAOImpl.updatePerson(person);
	}

	public void deletePerson(int id) {
		personDAOImpl.deletePerson(id);
	}

	public Person createPerson(String name, String surname, int birthYear) {
		Person person = new Person(name, surname, birthYear);
		return person;
	}
}
