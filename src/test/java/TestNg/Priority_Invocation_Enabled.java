package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled {
@Test(priority=3,invocationCount=1)
public void demo1() {
	System.out.println("hi demo 1");
}
@Test(priority=2,invocationCount=3,enabled=true)
public void demo2() {
	System.out.println("hi demo 2");
}

@Test(priority=-1,invocationCount=4,enabled=false)
public void demo3() {
	System.out.println("hi demo 3");
}
}

//every method is called testScript// and multiple maehod in one class///multiplescripts
//default priority is zero
//invocation zero or neagtive dont enter main method no excecution on main method
//enable true excute
//enabled false not execute
//REPORT will be generated==>test-output==>right click==>click==>emailable _report.html
///.program exe
//.suitfile exe