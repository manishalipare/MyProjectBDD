package Selenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchData {

	
	public static String GetData(String filePath,String SheetName,int row,int column )
	{
	String data = null;
	try
	{
		
		FileInputStream fis = new FileInputStream(filePath);
		Sheet sheet = WorkbookFactory.create(fis).getSheet(SheetName);
		data=sheet.getRow(row).getCell(column).getStringCellValue().toString();
		
	}
	catch (Exception e) {
		// TODO: handle exception
	}
	
	return data;
	
}
}
