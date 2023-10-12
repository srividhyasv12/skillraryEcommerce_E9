package TestNG_Group;

import org.testng.annotations.Test;

public class sample2 {
	@Test
	public void demo4() {
		System.out.println("hi demo 4");
	}


	@Test(groups="smoke")
	public void demo5() {
		System.out.println("hi demo 5");
	}

	@Test
	public void demo6() {
		System.out.println("hi demo 6");
	}
}
