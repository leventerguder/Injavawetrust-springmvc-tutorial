package _22.json.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import _22.json.model.Person;

@Controller
public class JSONController {

	@RequestMapping("/getPerson")
	@ResponseBody
	public Person getStudent() {
		return new Person("1", "Levent", "Erguder", "1989");
	}

	@RequestMapping("/getPersonList")
	@ResponseBody
	public List<Person> getPersonList() {
		// prepare data
		Person person1 = new Person("1", "Levent", "Erguder", "1989");
		Person person2 = new Person("2", "James", "Gosling", "1955");
		Person person3 = new Person("3", "Joshua", "Bloch", "1961");

		List<Person> personList = new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);

		return personList;
	}

}
