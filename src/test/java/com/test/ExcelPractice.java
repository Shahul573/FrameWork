package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWork\\Excell\\Book3.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet("Model");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);
				// System.out.println(cell);

				CellType type = cell.getCellType();
				// System.out.println(type);
				switch (type) {
				case STRING:

					String value = cell.getStringCellValue();
					System.out.println(value);
					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dformat = new SimpleDateFormat("dd-MMM-YY");
						String format = dformat.format(dateCellValue);
						System.out.println(format);

					} else {

						double numericCellValue = cell.getNumericCellValue();
						long round = Math.round(numericCellValue);
						if (round == numericCellValue) {
							String valueOf = String.valueOf(round);
							System.out.println(valueOf);
						} else {

							String valueOf = String.valueOf(numericCellValue);
							System.out.println(valueOf);

						}

					}

					break;

				default:
					break;
				}

			}

		}

	}

}
