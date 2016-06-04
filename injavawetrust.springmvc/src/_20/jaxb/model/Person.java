package _20.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class Person {

	private String id;
	private String name;
	private String surname;
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

	@XmlElement
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@XmlElement
	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
