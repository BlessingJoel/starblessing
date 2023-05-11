package classavd;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getExceldata(int Sheet,int row,int cell) throws Throwable, IOException {
		FileInputStream file=new FileInputStream("./src/test/resources/excel2.xlsx");
		Workbook book = WorkbookFactory.create(file);
		org.apache.poi.ss.usermodel.Sheet sheet = book.getSheetAt(Sheet);
		Row r = sheet.getRow(row);
		Cell cel = r.getCell(cell);
		String get = cel.getStringCellValue();
		return get;

	
		
	}
	
	//AddOrganization
//	public String excelFormat(int sheet,int row,int cell) throws Throwable {
//		FileInputStream file=new FileInputStream("./src/test/resources/excel2.xlsx");
//		Workbook book = WorkbookFactory.create(file);
//		DataFormatter format=new DataFormatter();
//	   
//	   String Exceldata = format.formatCellValue(book.getSheetAt(sheet).getRow(row).getCell(cell));
//	   return Exceldata;
//}
}


