package _14.exception.handling.controller;

import java.sql.SQLDataException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandlingController {

	@ExceptionHandler({SQLException.class, SQLDataException.class})
	public String handleGenericSQLException() {
		System.out.println("handleGenericSQLException...");
		return "12.exception.handling.view/genericSqlException";
	}

	@ExceptionHandler({IndexOutOfBoundsException.class})
	public ModelAndView handleGenericIndexOutOfBoundsException(HttpServletRequest req, Exception exception) {
		System.out.println("handleGenericIndexOutOfBoundsException...");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", exception);
		modelAndView.setViewName("12.exception.handling.view/genericIndexOutOfBoundsException");
		return modelAndView;
	}

	// Eger SimpleMappingExceptionResolver da kullanilmissa @ExceptionHandler
	// oncelikli olacaktir.
	// SimpleMappingExceptionResolver icin NullPointerException hatasi sonucu donecek
	// jsp dosyasini belirtmistik.
	// Ayni testi tekrar yaptigimizda genericNpe.jsp calisacaktir.
	// @ExceptionHandler({NullPointerException.class})
	// public String handleNullPointerException() {
	// System.out.println("handleNullPointerException...");
	// return "12.exception.handling.view/genericNpe";
	// }

}
