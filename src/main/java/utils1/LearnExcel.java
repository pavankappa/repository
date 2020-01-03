package utils;

	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class LearnExcel  {

		public String[][] learnExcel(String fileName) throws IOException {

			// creating object for XSSFWorkbook
			XSSFWorkbook wbook = new XSSFWorkbook("./data/" + fileName +".xlsx");

			// getting the sheet id
			XSSFSheet wsheet = wbook.getSheetAt(0);

			int rowCount = wsheet.getLastRowNum();
			System.out.println("Total Column Count is " + rowCount);
			short colCount = wsheet.getRow(0).getLastCellNum();
			System.out.println("Total Row Count is " + colCount);
			
			String[][] data = new String[rowCount][colCount];
					for (int i = 1; i <= rowCount; i++) {
						  XSSFRow row = wsheet.getRow(i);
								for (int j=0; j < colCount; j++)
								{
									XSSFCell cell = row.getCell(j);
									String value =  cell.getStringCellValue();
									data [i-1][j] = value;
									System.out.println(value); 
						  }
					}
					return data;		
		}						
}
