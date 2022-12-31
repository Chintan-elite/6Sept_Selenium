package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
		
	public ExcellReader(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}


	String filePath;
	String sheetName;
	
	public int rowCount()
	{
		int i=0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			i = worksheet.getPhysicalNumberOfRows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	public int colCount()
	{
		int i=0;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			i = worksheet.getRow(0).getPhysicalNumberOfCells();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	public String getData(int row, int col)
	{
		String data = null;
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(filePath);
			XSSFSheet worksheet = workbook.getSheet(sheetName);
			data = worksheet.getRow(row).getCell(col).getStringCellValue();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
