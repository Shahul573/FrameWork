package com.testing;

import java.io.File;
import java.io.FileInputStream;
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
	
	Row row = sheet.getRow(1);
	
	//Cell cell = row.getCell(1);
	//System.out.println(cell);
	
	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
		
		Cell cell2 = row.getCell(i);
		System.out.println(cell2);
		
		
	}
	
	
	
}
		
	}


