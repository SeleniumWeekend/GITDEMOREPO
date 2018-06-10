package com.datapro;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel 
{
	public static String getData(String sheetName, int rowNum, int cellNum)
	{
		String data = null;
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\SHALINI KUMARI\\Desktop\\TestdataSuite.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet(sheetName);
			
			XSSFRow row = sheet.getRow(rowNum);
			XSSFCell cel = row.getCell(cellNum);
			
			data = cel.getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	}
}
