package _23.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonList {

	@XmlElement(name = "person-definition")
	private List<Person> personList;
	
	public PersonList() {
		super();
	}

	public PersonList(List<Person> personList) {
		super();
		this.personList = personList;
	}

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}

}
