package week5.day12;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	

	public String[][] readExcel(String excelFilename) throws IOException {
		@SuppressWarnings("resource")
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelFilename+".xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
	    int rowCount = wsheet.getLastRowNum();
	    // System.out.println(rowCount);
	    XSSFRow header = wsheet.getRow(0);
	    short cellCount = header.getLastCellNum();
	    // System.out.println(cellCount);
	    String[][] data = new String[rowCount][cellCount];
		for (int j = 1; j <=rowCount; j++) {
			XSSFRow row = wsheet.getRow(j);
			for (int i = 0; i < cellCount; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data[j-1][i]=value;
			} 
		}
		return data;
		
		
		
		
		
		// For Single Value
		/*
		 * XSSFWorkbook wbook = new XSSFWorkbook("./data/createLead.xlsx"); XSSFSheet
		 * wsheet = wbook.getSheetAt(0); XSSFRow row = wsheet.getRow(1); XSSFCell cell =
		 * row.getCell(0); String value = cell.getStringCellValue();
		 * System.out.println(value);
		 */
		 
		//For entire columns of a row
		/*
		XSSFRow row = wsheet.getRow(1);
		for (int i = 0; i < 3; i++) {
			XSSFCell cell = row.getCell(i);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		*/
		
		// for entire data
		 /* XSSFWorkbook wbook = new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		for (int j = 1; j <=3; j++) {
			XSSFRow row = wsheet.getRow(j);
			for (int i = 0; i < 3; i++) {
				XSSFCell cell = row.getCell(i);
				String value = cell.getStringCellValue();
				System.out.println(value);
				}
			}
				
		 */
		
		
		 
	}

}
