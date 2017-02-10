package _23.jaxb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import _23.jaxb.model.Person;
import _23.jaxb.model.PersonList;

@Controller
public class JAXBPersonController {

	@RequestMapping("/getPersonXML")
	@ResponseBody
	// http://localhost:8080/injavawetrust.springmvc/getPersonXML
	public Person getPersonXML() {
		return new Person("1", "Levent", "Erguder", "1989");
	}

	@RequestMapping("/getPersonListXML")
	@ResponseBody
	// http://localhost:8080/injavawetrust.springmvc/getPersonListXML
	public PersonList getPersonListXML() {
		// prepare data
		Person person1 = new Person("1", "Levent", "Erguder", "1989");
		Person person2 = new Person("2", "James", "Gosling", "1955");
		Person person3 = new Person("3", "Joshua", "Bloch", "1961");

		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		PersonList personList = new PersonList(persons);

		return personList;
	}
}