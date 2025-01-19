package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWork\\Excell\\Book1.xlsx");
	
	FileInputStream file = new FileInputStream(f);
	
	Workbook book = new XSSFWorkbook(file);
	
	Sheet sheet = book.getSheet("Sheet1");
	
	//Row row = sheet.getRow(8);
	
	//Cell cell = row.getCell(1);
	//System.out.println(cell);
	
	//for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
		
		//Cell cell2 = row.getCell(i);
		//System.out.println(cell2);
		
		
	//}
	
	//Cell cell = row.getCell(0);
	
	//string cell data
	//String value = cell.getStringCellValue();
	
	//verify data cell is equal to messi
	//if (value.equals("Messi")) {
		//cell.setCellValue("Vinicius");
	//}
	
	//converts objects to file FileOutputStream...class-save
	
	//FileOutputStream fileoutputsteram=new FileOutputStream(f);
	
	//write in workbook
	//book.write(fileoutputsteram);
	
	//if the cell is empty
	
	//create the cell
	//Cell cell = row.createCell(3);
	//cell.setCellValue("API");
	
	//FileOutputStream fileoutputstream=new FileOutputStream(f);
	//book.write(fileoutputstream);;
	
	//if the row is empty
	
	//create the row
	
	Row row = sheet.createRow(13);
	
	//create the cell
	Cell cell = row.createCell(3);
	cell.setCellValue("TestNg");
	
	FileOutputStream fileoutputstream=new FileOutputStream(f);
	book.write(fileoutputstream);
	
}
		
	}


