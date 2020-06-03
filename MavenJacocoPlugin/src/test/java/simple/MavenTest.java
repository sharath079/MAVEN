package simple;

import test.HelloWorld;

public class MavenTest {
	
	HelloWorld hw=new HelloWorld();
	
	public void testHello() {
		System.out.println("TEST :: Hello");
	}
    
	public void testmaven() {
		
		System.out.println("TEST :: Maven");
	}
	
	public void testadd1() {
		float res;
		
		res=hw.add(10, 20);
		System.out.println("Result ::"+res);
				
	}
	
	public void testadd2() {
		float res;
		
		res=hw.add(-10, 20);
		System.out.println("Result ::"+res);
	}
	
	public void testadd3() {
		float res;
		
		res=hw.add(-50, -50);
		System.out.println("Result ::"+res);
	}
	
	public void testmul() {
		int res;
		
		res=hw.mul(25, 25);
		System.out.println("Mul Result ::"+res);
	}
	
	public void testmul1() {
		int res;
		
		res=hw.mul(30, 30);
		System.out.println("Mul Result ::"+res);
	}
	
}

