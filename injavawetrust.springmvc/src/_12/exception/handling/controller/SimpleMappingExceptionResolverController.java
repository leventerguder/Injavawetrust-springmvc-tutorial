package _12.exception.handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import _12.exception.handling.model.DatabaseException;

@Controller
public class SimpleMappingExceptionResolverController {

	@RequestMapping("/numberFormatException")
	public ModelAndView throwNumberFormatException() {
		throw new NumberFormatException();
	}

	@RequestMapping("/nullPointerException")
	public ModelAndView throwNullPointerException() {
		throw new NullPointerException();
	}

	@RequestMapping("/databaseException")
	String throwDatabaseException() throws Exception {
		throw new DatabaseException("DB-1000", "DB Connection timeout...");
	}
}