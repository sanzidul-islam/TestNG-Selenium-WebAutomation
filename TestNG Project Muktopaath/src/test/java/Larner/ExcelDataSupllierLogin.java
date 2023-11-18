package Larner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupllierLogin {
	@DataProvider(name = "data1")
	public String[][] getdata() throws Exception {
		File exclFile =new File("./src/test/resources/TestDataLogin.xlsx");
		//System.out.println(exclFile.exists());
		FileInputStream fis = new FileInputStream(exclFile);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int NoOfRow = sheet.getPhysicalNumberOfRows();
		int NoOfColumn =sheet.getRow(0).getLastCellNum();
		 String[][] data= new String[NoOfRow-1][NoOfColumn];
		 
		for (int i = 0; i < NoOfRow-1; i++) {
			for (int j = 0; j < NoOfColumn; j++) {
				DataFormatter dF = new DataFormatter();
				data[i][j]= dF.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		workbook.close();
		fis.close();
		return data;
	}
}
