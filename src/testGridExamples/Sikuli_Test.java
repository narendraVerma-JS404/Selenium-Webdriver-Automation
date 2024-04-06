package testGridExamples;

import org.sikuli.script.Screen;

public class Sikuli_Test {
	public static void main(String[] args) throws Exception {
		
		 //Test Case Steps
		
		Screen sc = new Screen();
		Thread.sleep(4000);
		
		sc.click("D:\\Capture.PNG");       //Eclipse minimize
		Thread.sleep(4000);
		sc.click("D:\\Capturest.PNG");     //Sonma typing
		Thread.sleep(4000);
		sc.click("D:\\CaptureClip.PNG");   //Eclipse Icon Taskbar
		Thread.sleep(4000);
		sc.click("D:\\CaptureChrome.PNG");  //Click Chrome
		Thread.sleep(4000);
		sc.click("D:\\CaptureLogin.PNG");   //Click Login
		Thread.sleep(4000);
		sc.click("D:\\CaptureOK.PNG");     //Click Ok Popup
		Thread.sleep(4000);
		sc.click("D:\\CaptureAddBtn.PNG");  //AddEmp btn
		Thread.sleep(4000);
		sc.click("D:\\CaptureAddempSaveBtn.PNG");  //Add emp save btn
		Thread.sleep(4000);
		sc.click("D:\\CaptureEmpEditBtn.PNG");  //Edit emp btn
		Thread.sleep(4000);
		sc.click("D:\\CaptureEdtSave.PNG");      //Edit emp save btn    
		Thread.sleep(4000);
		

}
}
