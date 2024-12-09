package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readmultipledata {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("./Testdata/FacebookCretendial.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	XSSFSheet sheet=book.getSheet("Sheet1");
	int lr=sheet.getLastRowNum();
	for(int i=0;i<lr;i++)
	{
		XSSFRow row=sheet.getRow(i);
		XSSFCell cell=row.getCell(0);
		String cellval=cell.getStringCellValue();
		XSSFCell cel2=row.getCell(i);
		String cellval2=cel2.getStringCellValue();
		System.out.println(cellval+" "+cellval2);
	}
	book.close();
	fis.close();
}
}
