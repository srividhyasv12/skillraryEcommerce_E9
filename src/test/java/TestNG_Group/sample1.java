package TestNG_Group;

import org.testng.annotations.Test;

public class sample1 {
@Test(groups="smoke")
public void demo1() {
	System.out.println("hi demo 1");
}


@Test
public void demo2() {
	System.out.println("hi demo 2");
}

@Test(groups="smoke")
public void demo3() {
	System.out.println("hi demo 3");
}

}
