package _21.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee-list")
public class EmployeeList {

	private List<Employee> personList;

	@XmlElement(name = "employee-definition")
	public List<Employee> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Employee> personList) {
		this.personList = personList;
	}

	public EmployeeList() {
		super();
	}

	public EmployeeList(List<Employee> personList) {
		super();
		this.personList = personList;
	}

}
