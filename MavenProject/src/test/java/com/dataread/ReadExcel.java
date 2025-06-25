package com.dataread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void ExCelDataReader() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+"\\DataReader\\Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);//Open the workbook 
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(4);
		XSSFCell col = row.getCell(2);
		System.out.println(col);
		
	int rowcount = sheet.getLastRowNum();
	
	System.out.println(rowcount);
		
	}

}
