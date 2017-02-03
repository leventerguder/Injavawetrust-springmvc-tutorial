package _14.exception.handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import _14.exception.handling.model.DatabaseException;

@Controller
public class SimpleMappingExceptionResolverController {

	@RequestMapping("/numberFormatException")
	//http://localhost:8080/injavawetrust.springmvc/numberFormatException
	public ModelAndView throwNumberFormatException() {
		throw new NumberFormatException();
	}

	@RequestMapping("/nullPointerException")
	//http://localhost:8080/injavawetrust.springmvc/nullPointerException
	public ModelAndView throwNullPointerException() {
		throw new NullPointerException();
	}

	@RequestMapping("/databaseException")
	//http://localhost:8080/injavawetrust.springmvc/databaseException
	String throwDatabaseException() throws Exception {
		throw new DatabaseException("DB-1000", "DB Connection timeout...");
	}
}