package _20.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person-list")
public class PersonList {

	private List<Person> personList;

	@XmlElement(name = "person-definition")
	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

	public PersonList() {
		super();
	}

	public PersonList(List<Person> personList) {
		super();
		this.personList = personList;
	}

}
