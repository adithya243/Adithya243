package selenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writesingledata {
public static void main(String[] args) throws Exception {
	XSSFWorkbook book=new XSSFWorkbook();
	XSSFSheet sheet=book.createSheet("Automation engg adi");
	XSSFRow row=sheet.createRow(0);
	XSSFCell cell=row.createCell(0);
	cell.setCellValue("Automation class");
	FileOutputStream fos=new FileOutputStream("./Testdata/Frameworks.xlsx");
	book.write(fos);
	book.close();
	fos.close();
}
}
