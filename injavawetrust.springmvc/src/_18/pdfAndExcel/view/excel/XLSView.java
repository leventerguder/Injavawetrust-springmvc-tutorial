package _18.pdfAndExcel.view.excel;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import _18.pdfAndExcel.model.Person;

public class XLSView extends AbstractXlsView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		
		List<Person> personList = (List<Person>) model.get("persons");

		Sheet sheet = workbook.createSheet();

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Id");
		header.createCell(1).setCellValue("Name");
		header.createCell(2).setCellValue("Surname");
		header.createCell(3).setCellValue("BirthYear");

		int rowNum = 1;
		for (Person person : personList) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(person.getId());
			row.createCell(1).setCellValue(person.getName());
			row.createCell(2).setCellValue(person.getSurname());
			row.createCell(3).setCellValue(person.getBirthYear());

		}
	}

}
