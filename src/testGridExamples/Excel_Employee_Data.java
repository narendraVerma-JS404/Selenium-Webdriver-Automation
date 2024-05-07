package testGridExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Employee_Data {
	
	public static void main(String[] args) throws Exception{
		FileInputStream empobj = new FileInputStream("D:\\xl\\EmpData.xls");
		Workbook wb = Workbook.getWorkbook(empobj);

		Sheet st = wb.getSheet(0);
        
		int rowcount = st.getRows();
		int colcount = st.getColumns();

		System.out.println(rowcount);
		System.out.println(colcount);

		for(int i=1; i<rowcount; i++) 
		
		{
        
		String Year = st.getCell(0,i).getContents();

		String Team = st.getCell(1,i).getContents();

		String PlayerName = st.getCell(2,i).getContents();

		String Role = st.getCell(3,i).getContents();
		
		String Age = st.getCell(4,i).getContents();
		
		String HighestScore = st.getCell(5,i).getContents();

		System.out.println(Year+"||"+Team+"||"+PlayerName+"||"+Role+"||"+Age+"||"+HighestScore);

	}
	}
}


