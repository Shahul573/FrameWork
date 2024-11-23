package com.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		// mention the path of excel

		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\FrameWork\\Excell\\Book2.xlsx");

//get the objects/bytes from file....>file input stream
		FileInputStream stream = new FileInputStream(file);

//mention the workbook...>collection of sheet
		Workbook book = new XSSFWorkbook(stream);

		// sheet name
		Sheet sheet = book.getSheet("Login");

		// rows iterate

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				// System.out.println(cell);

				// type of cell String...text numeric...number

				org.apache.poi.ss.usermodel.CellType type = cell.getCellType();

				switch (type) {
				case STRING:

					String value = cell.getStringCellValue();
					System.out.println(value);
					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {

						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-YY");
						String format = dateformat.format(dateCellValue);
						System.out.println(format);

					} else {
						// double numericCellValue = cell.getNumericCellValue();
						// BigDecimal b = BigDecimal.valueOf(numericCellValue);
						// String num = b.toString();
						// System.out.println(num);

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
