package TestNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelReader() throws IOException {
		workbook = new XSSFWorkbook("./src/test/resources/Auto (1).xlsx");
		sheet = workbook.getSheet("data");
	}
	
	public static void main(String[] args) throws IOException {
		ExcelReader reader = new ExcelReader();
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println(rowCount);
		System.out.println(colCount);
		
		
		//System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
				String celldata = sheet.getRow(row).getCell(col).getStringCellValue();
				System.out.println(celldata);
			}
		}
		
	}
	
	
}
