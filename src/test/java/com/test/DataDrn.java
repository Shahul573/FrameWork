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

public class DataDrn {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//how to create  the new workbook
		
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWork\\Excell\\Hello.xlsx");
		
		//create the workbook
		Workbook book=new XSSFWorkbook();
		
		//create the new sheet
		Sheet sheet = book.createSheet("Login");
			
		//create the row
		Row row = sheet.createRow(6);
		
		//create the cell
		
		Cell cell = row.createCell(0);
		cell.setCellValue("JUnit");
		
		FileOutputStream fileoutputstream=new FileOutputStream(f);
		book.write(fileoutputstream);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
