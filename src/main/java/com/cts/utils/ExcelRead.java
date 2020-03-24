package com.cts.utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static String[][] excelData(String fileDetails, String sheetname) throws IOException 
	{
		String[][] data = null;
		FileInputStream file = null;
		XSSFWorkbook book = null;
		try {

			file = new FileInputStream(fileDetails);

			book = new XSSFWorkbook(file);

			XSSFSheet sheet = book.getSheet(sheetname);

			int rowCount = sheet.getPhysicalNumberOfRows();
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

			DataFormatter format = new DataFormatter();

			data = new String[rowCount - 1][cellCount];

			for (int i = 1; i < rowCount; i++) {
				for (int j = 0; j < cellCount; j++) {

					XSSFCell cell = sheet.getRow(i).getCell(j);

					String cellValue = format.formatCellValue(cell);
					data[i - 1][j] = cellValue;

				}

			}

		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}

		finally {
			book.close();
			file.close();

		}
		return data;
	}

}
