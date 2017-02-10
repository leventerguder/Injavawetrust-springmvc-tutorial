package _24.jaxb.oxm.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee-list")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeList {

	@XmlElement(name = "employee-definition")
	private List<Employee> personList;
	
	public EmployeeList() {
		super();
	}

	public EmployeeList(List<Employee> personList) {
		super();
		this.personList = personList;
	}

	public List<Employee> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Employee> personList) {
		this.personList = personList;
	}

}
