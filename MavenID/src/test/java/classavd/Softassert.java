package classavd;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
    
	@Test
	public void createCustomerTest(){
		System.out.println("Rko");
		System.out.println("cena");
		SoftAssert s = new SoftAssert();
		s.assertEquals("A", "a");
		System.out.println("step_3");
		s.assertEquals("X", "X");
		System.out.println("step_4");
		s.assertAll();
	}
	@Test
	public void modifyCustomerTest(){
		System.out.println("======");
		System.out.println("step_1");
		System.out.println("step_2");
		System.out.println("step_3");
		System.out.println("step_4");

}
}
