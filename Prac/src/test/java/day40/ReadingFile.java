package day40;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFCell;





public class ReadingFile {

	public static void main(String[] args)throws Exception {

		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx");
		
		
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		
		int totalRow= sheet.getLastRowNum();
		int totalCells= sheet.getRow(1).getLastCellNum();
		
		
		System.out.println("Number of rows"+ totalRow);

		System.out.println("Number of cells"+ totalCells);
	
		
	for(int r=0;r<=totalRow;r++) {
	
     XSSFRow currentRow=sheet.getRow(r);
     
     for(int c=0;c<totalCells;c++) {
    	 
    	 XSSFCell cell= currentRow.getCell(c);
    	 System.out.print(cell.toString() + "\t");
     }
     System.out.println();
}
	workbook.close();
	file.close();
	}
}
	