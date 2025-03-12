package day40;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class WritingFile2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myfile.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		
	
		XSSFSheet sheet=workbook.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue(9);
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(3);
		row2.createCell(2).setCellValue("Java");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("Java");
		row3.createCell(1).setCellValue(12);
		row3.createCell(2).setCellValue("Testing");
	
	workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.println(" File is Created");

	}

}
