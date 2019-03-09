package DataDriven;

import Xls_Reader.Xls_Reader;

public class Exceloperation {
	public static void main(String[] args) throws InterruptedException {
	Xls_Reader data = new Xls_Reader("C:\\Users\\Hema\\eclipse-workspace\\DataDrivenDemo\\src\\TestData\\TestData.xlsx");

	
	if(!data.isSheetExist("RegistrationPage")) {
		data.addSheet("RegistrationPage");
	}
	
	
/*int colcount = data.getColumnCount("SignUp");
System.out.println(colcount);
int rownum = data.getCellRowNum("SignUp", "FirstName", "Hemalatha");
System.out.println(rownum);*/
	}
}
