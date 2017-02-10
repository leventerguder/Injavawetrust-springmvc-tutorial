package _23.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

	@XmlElement
	private String id;
	@XmlElement
	private String name;
	@XmlElement
	private String surname;
	@XmlElement
	private String birthYear;

	public Person() {
		// default constructor zorunlu.
		// com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationsException:
		super();
	}

	public Person(String id, String name, String surname, String birthYear) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
