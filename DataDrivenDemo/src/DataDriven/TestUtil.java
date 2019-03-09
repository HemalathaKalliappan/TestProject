package DataDriven;

import java.util.ArrayList;

import Xls_Reader.Xls_Reader;

public class TestUtil {
	

	public static ArrayList<Object[]> getdatafromexcel() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		Xls_Reader data = new Xls_Reader("C:\\Users\\Hema\\eclipse-workspace\\DataDrivenDemo\\src\\TestData\\TestData.xlsx");
	
		 for(int rownum = 2; rownum <=data.getRowCount("SignUp"); rownum++) {
			 String firstname = data.getCellData("SignUp", "FirstName", rownum);
			 String Lastname = data.getCellData("SignUp", "LastName", rownum);
		     String Username = data.getCellData("SignUp", "UserName", rownum);
		     String Password = data.getCellData("SignUp", "Password", rownum);
		     Object ob[]= {firstname,Lastname,Username,Password};
		     mydata.add(ob);
		 }

	return mydata;
}
}