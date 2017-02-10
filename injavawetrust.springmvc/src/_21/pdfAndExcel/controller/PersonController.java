package _21.pdfAndExcel.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import _21.pdfAndExcel.model.Person;

@Controller
public class PersonController {

	@RequestMapping("/persons")
	public ModelAndView handlePersonList() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("personListView");
		mv.addObject("persons", preparePersons());
		return mv;
	}

	@RequestMapping("/pdfExport")
	public ModelAndView pdfExport(HttpServletResponse response) {

		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "attachment; filename=exportMy.pdf");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("pdfView");
		mv.addObject("persons", preparePersons());
		return mv;
	}

	@RequestMapping(value = "/excelExport", method = { RequestMethod.POST })
	public ModelAndView excelExport(HttpServletResponse response) {

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=myExcelExport.xls");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("excelView");
		mv.addObject("persons", preparePersons());
		return mv;
	}

	@RequestMapping(value = "/jExcelExport", method = { RequestMethod.POST })
	public ModelAndView jExcelExport(HttpServletResponse response) {

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=myJExcelExport.xls");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("jExcelView");
		mv.addObject("persons", preparePersons());
		return mv;
	}

	@RequestMapping(value = "/xlsExport", method = { RequestMethod.POST })
	public ModelAndView xlsViewExport(HttpServletResponse response) {

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=myXlsExport.xls");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("xlsView");
		mv.addObject("persons", preparePersons());
		return mv;
	}

	@RequestMapping(value = "/xlsxExport", method = { RequestMethod.POST })
	public ModelAndView xlsxViewExport(HttpServletResponse response) {

		response.setContentType("application/vnd.ms-excel");
		response.setHeader("Content-Disposition", "attachment; filename=myXlsxExport.xls");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("xlsxView");
		mv.addObject("persons", preparePersons());
		return mv;
	}

	public List<Person> preparePersons() {
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
