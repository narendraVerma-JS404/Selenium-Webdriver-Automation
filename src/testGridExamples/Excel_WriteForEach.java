package testGridExamples;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteForEach {
	
	public static void main(String[] args) throws Exception{
		
	 XSSFWorkbook workbook = new XSSFWorkbook();
	 XSSFSheet sheet = workbook.createSheet("Employee Details");
	 
	 ArrayList<Object[]> empdata = new ArrayList<Object[]>();
	 
	 empdata.add(new Object[]{"EmpID","Name","Job"});
	 empdata.add(new Object[]{101,"David","Devloper"});
	 empdata.add(new Object[]{102,"Kamal","Tester"});
	 empdata.add(new Object[]{103,"Daman","Database Eng"});
	 
	 // using for each loop
	 
	 int rownum = 0;
     
	 for (Object[] emp:empdata)
	 {
		 XSSFRow row = sheet.createRow( rownum++);
		 int cellnum=0;
		 
		 for (Object value: emp)
		 {
			 XSSFCell cell = row.createCell(cellnum++);
			 
			 if(value instanceof String)
				 cell.setCellValue((String)value);
			 
			 if(value instanceof Integer)
				 cell.setCellValue((Integer)value);
			 
			 if(value instanceof Boolean)
				 cell.setCellValue((Boolean)value);
		 }
	 }
	 
	 String filepath="D:\\ImportExcelFiles\\Employee Details.xlsx";
	 FileOutputStream outstream = new FileOutputStream(filepath);
	 workbook.write(outstream);
	 
	 outstream.close();
	 
	 System.out.println("Employee.xlsx File written successfully");
	}

}
