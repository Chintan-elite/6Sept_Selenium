package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
	public static void main(String[] args) {
		
		ExcellReader ex = new ExcellReader();
		int rows =  ex.rowCount();
		System.out.println("total rows : "+rows);
		int cols = ex.colCount();
		System.out.println("total cols : "+cols);
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				String data = ex.getData(i, j);
				System.out.print(data+"  ");
			}
			System.out.println();
		}
		
	}
	
	
	String filePath = "C:\\Users\\chintan\\Desktop\\classwork\\mytest.xlsx";
	String sheetName = "reg";
	
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
