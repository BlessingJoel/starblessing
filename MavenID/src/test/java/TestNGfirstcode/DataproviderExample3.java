package TestNGfirstcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample3 {
@Test(dataProvider = "bookticketDataProvider")
	
	public void bookticket(String src ,String dest ,int ticket) {
	System.out.println("execute source =>"+src +",Destinaton==>"+dest);
	}
	@DataProvider
	public Object[][] bookTicketDataprovider(){
		Object[][] obj=new Object[5][3];
		obj[0][0]="Bangalore";
		obj[0][1] = "Mysore";
		obj[0][2] = 10;
		
		obj[1][0] ="bangalore";
		obj[1][1] ="Goa";
		obj[1][2] =10;
		
		obj[2][0] ="Bangalore";
		obj[2][1] ="Manglore";
		obj[2][2] =10;
		
		obj[3][0] = "Bangalore";
		obj[3][1] = "kerala";
		obj[3][2] = 10;
		
		obj[4][0] = "Bangalore";
		obj[4][1] = "kerala";
		obj[4][2] = 10;
		return obj;
}
}
