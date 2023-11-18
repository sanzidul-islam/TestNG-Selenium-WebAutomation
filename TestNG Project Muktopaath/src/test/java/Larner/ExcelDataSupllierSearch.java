package Larner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupllierSearch {
	@DataProvider(name = "data2")
	public String[][] getdata() throws Exception {
		//access the file
		File excelFile= new File("./src/test/resources/Phone.xlsx");
		System.out.println(excelFile.exists());
		//creating the row data 
		FileInputStream fio = new FileInputStream(excelFile);
		//creating the row data in excel workbook formate
		XSSFWorkbook workbook = new XSSFWorkbook(fio);
		//getting the sheet
		XSSFSheet sheet =workbook.getSheet("Sheet1");
		int NoOfRow = sheet.getPhysicalNumberOfRows();
		int NoOfColumn = sheet.getRow(0).getLastCellNum();
		String[][] data= new String[NoOfRow-1][NoOfColumn];
		for (int i = 1; i < NoOfRow; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < NoOfColumn; j++) {
				//DataFormatter dF = new DataFormatter();
				//data[i][j]= dF.formatCellValue(sheet.getRow(i+1).getCell(j));
				data[i - 1][j] = row.getCell(j).getStringCellValue();
			}
		}
		
		
		workbook.close();
		fio.close();
		return data;
	}
}
