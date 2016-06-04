package _18.pdfAndExcel.view.pdf;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import _18.pdfAndExcel.model.Person;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfView extends AbstractPdfView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Person> personList = (List<Person>) model.get("persons");
		
		Table table = new Table(4);
		table.addCell("Id");
		table.addCell("Name");
		table.addCell("Surname");
		table.addCell("BirtYear");

		for (Person person : personList) {
			table.addCell(person.getId());
			table.addCell(person.getName());
			table.addCell(person.getSurname());
			table.addCell(person.getBirthYear());
		}

		document.add(table);
	}

}
