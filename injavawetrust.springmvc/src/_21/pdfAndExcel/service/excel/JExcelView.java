package _21.pdfAndExcel.service.excel;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.springframework.web.servlet.view.document.AbstractJExcelView;
import _21.pdfAndExcel.model.Person;

@SuppressWarnings("deprecation")
public class JExcelView extends AbstractJExcelView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, WritableWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<Person> personList = (List<Person>) model.get("persons");

		WritableSheet sheet = workbook.createSheet("Revenue Report", 0);
		sheet.addCell(new Label(0, 0, "Id"));
		sheet.addCell(new Label(1, 0, "Name"));
		sheet.addCell(new Label(2, 0, "Surname"));
		sheet.addCell(new Label(3, 0, "BirthYear"));

		int rowNum = 1;
		for (Person person : personList) {

			sheet.addCell(new Label(0, rowNum, person.getId()));
			sheet.addCell(new Label(0, rowNum, person.getName()));
			sheet.addCell(new Label(0, rowNum, person.getSurname()));
			sheet.addCell(new Label(0, rowNum, person.getBirthYear()));
			rowNum++;
		}
	}

}
