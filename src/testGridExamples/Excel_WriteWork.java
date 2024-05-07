package testGridExamples;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteWork {
	
	public static void main(String[] args) throws Exception {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		
		Object empdata[][] = { { "EmpID","Name","Job"},
				               { 101,"David","Engineer"},
				               {102,"Smith","Manager"},
				               {103,"Scott","Analysis"},
				               {104,"Nkv","Tester"},
				            	   
				               };
		//Using For Loop
		
		int rows = empdata.length;
		int cols = empdata[0].length;
		
		System.out.println(rows);//4
		System.out.println(cols);//3
		
		for (int r=0; r<rows; r++)//0
			
		{
			XSSFRow row = sheet.createRow(r);
			
			for(int c =0; c<cols; c++)
			{
				XSSFCell cell =row.createCell(c);
				Object value = empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
				
			}
		}
		
		String filepath = "D:\\ImportExcelFiles\\employee.xlsx";
		FileOutputStream outstream = new FileOutputStream(filepath);
		workbook.write(outstream);
		
		outstream.close();
		
		System.out.println("Employee. xlsx file written succesfully.....");
		}
	}


