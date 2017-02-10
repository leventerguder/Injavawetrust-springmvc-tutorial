package _26.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import _26.jpa.domain.Person;
import _26.jpa.service.PersonServiceImpl;

@Controller
public class PersonController {

	@Autowired
	private PersonServiceImpl personServiceImpl;

	@RequestMapping(value = "/person.list", method = RequestMethod.GET)
	// http://localhost:8080/injavawetrust.springmvc/person.list
	public String getPersonList(Model model) {

		System.out.println("...getPersonList...");

		List<Person> personList = personServiceImpl.getAllPersons();
		model.addAttribute("newPerson", new Person());
		model.addAttribute("allPersons", personList);

		return "26.jpa.view/personList";
	}

	@RequestMapping(value = "/person.add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("newPerson") Person person, Model model) {

		System.out.println("...addPerson...");

		personServiceImpl.insertPerson(person);

		return "redirect:/person.list";
	}

	@RequestMapping(value = "/person.delete{personId}", method = RequestMethod.GET)
	public String deletePerson(@RequestParam("personId") int id) {

		System.out.println("...deletePerson...");

		personServiceImpl.deletePerson(id);

		return "redirect:/person.list";
	}

	@RequestMapping(value = "/person.edit{personId}", method = RequestMethod.GET)
	public String editPerson(@RequestParam("personId") int id, Model model) {

		System.out.println("...editPerson ...");

		model.addAttribute("newPerson", personServiceImpl.getPersonById(id));
		model.addAttribute("allPersons", personServiceImpl.getAllPersons());
		model.addAttribute("update", "update");

		return "26.jpa.view/personList";
	}

	@RequestMapping(value = "/person.update", method = RequestMethod.POST)
	public String updatePerson(@ModelAttribute("newPerson") Person person, Model model) {

		System.out.println("...update person...");

		personServiceImpl.updatePerson(person);

		return "redirect:/person.list";
	}

}
