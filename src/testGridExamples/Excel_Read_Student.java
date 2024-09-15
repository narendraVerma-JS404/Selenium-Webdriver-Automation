package testGridExamples;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read_Student 
   {
	
	public static void main(String[] args) throws Exception{
		FileInputStream data = new FileInputStream("D:\\StudentData.xls");
		Workbook wb = Workbook.getWorkbook(data);
		Sheet st = wb.getSheet(0);
		
		int rowcount = st.getRows();
		
		//int row = 30;
		
//		String Roll_No = st.getCell(0,row).getContents();
//		String Name    = st.getCell(1,row).getContents();
//		String Subject = st.getCell(2,row).getContents();
//		String Marks   = st.getCell(3,row).getContents();
//		String Result  = st.getCell(4,row).getContents();
//		String Class   = st.getCell(5,row).getContents();
//		
	//	System.out.println(Roll_No+"||"+Name+"||"+Subject+"||"+Marks+"||"+Result+"||"+Class+"||");
		System.out.println("Total Row Count = "+rowcount);

		for(int i=0; i<rowcount; i++) {
		String Roll_No = st.getCell(0,i).getContents();
		String Name    = st.getCell(1,i).getContents();
		String Subject = st.getCell(2,i).getContents();
		String Marks   = st.getCell(3,i).getContents();
		String Result  = st.getCell(4,i).getContents();
		String Class   = st.getCell(5,i).getContents();
		
		System.out.println(Roll_No+"||"+Name+"||"+Subject+"||"+Marks+"||"+Result+"||"+Class+"||");
		
	}
	
	
	}
   }

