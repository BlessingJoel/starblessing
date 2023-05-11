package TestNGfirstcode;

import org.testng.annotations.Test;

public class TestNG {
	@Test(priority=2)
	public void TestNG() {
		System.out.println("captain miller");
		
	}
	@Test(priority=1)
	public void customertest() {
	;
		System.out.println("randy orton");
		int[] arr = {1,2,3};
		System.out.println(arr[1]);
	}
	@Test(priority=3)
	public void Enduser() {
	System.out.println("Black squad");
	}
}
