package testGridExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {
	
	public static void main(String[] args) throws Exception {
		
		
		
			FileInputStream fs = new FileInputStream("D:\\xl\\NarendraPoI.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			System.out.println(sheet.getSheetName());
			System.out.println(sheet.getLastRowNum());
			System.out.println("Before updating Cell Data ===>"+sheet.getRow(3).getCell(1));
			
			// Write the data to excel file
			XSSFCell cell = sheet.getRow(3).getCell(1);
			cell.setCellValue("IronMan");
			fs.close();
			FileOutputStream fileOut=new FileOutputStream("D:\\xl\\NarendraPoI.xlsx");
			workbook.write(fileOut);
			System.out.println("Updated data after write is done ===>" + cell.getStringCellValue());
			fileOut.close();
			
		
	}

}
