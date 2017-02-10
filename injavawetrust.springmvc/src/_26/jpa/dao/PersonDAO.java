package _26.jpa.dao;

import java.util.List;

import _26.jpa.domain.Person;

public interface PersonDAO {

	public void insertPerson(Person person);

	public Person getPersonById(int id);

	public List<Person> getAllPersons();

	public void updatePerson(Person person);

	public void deletePerson(int id);

}
