package classavd;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Hardassert {
	@Test
	public void createCustomerTest(){
		System.out.println("step_1");
		System.out.println("step_2");
		org.testng.Assert.assertNotEquals(false,"open the home page");
		//Assert.assertEquals("A", "B");
		System.out.println("step_3");
		System.out.println("step_4");
	}
	@Test
	public void modifyCustomerTest(){
		System.out.println("======");
		System.out.println("step_1");
		System.out.println("step_2");
		System.out.println("step_3");
	}


}
