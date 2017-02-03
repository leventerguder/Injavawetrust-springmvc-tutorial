package _15.exception.handling.annotation.controller;

import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionHandlingController {

	@RequestMapping("/sqlException")
	String throwSQLException() throws SQLException {
		System.out.println("SQLException....");
		throw new SQLException();
	}

	@RequestMapping("/indexOutOfBoundsException")
	String throwIndexOutOfBoundsException() {
		System.out.println("IndexOutOfBoundsException....");
		throw new IndexOutOfBoundsException();
	}

	@ExceptionHandler({SQLException.class, SQLDataException.class})
	public String handleSQLException() {
		return "12.exception.handling.view/sqlException";
	}

	@ExceptionHandler({IndexOutOfBoundsException.class})
	public ModelAndView handleIndexOutOfBoundsException(HttpServletRequest req, Exception exception) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", exception);
		modelAndView.setViewName("12.exception.handling.view/indexOutOfBoundsException");
		return modelAndView;
	}
}
