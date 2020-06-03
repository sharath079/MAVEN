package test;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Maven...");
		System.out.println(StringUtils.upperCase("hello maven..."));
		
		}
	
	public float add(int a,int b) 
	{
		
		float res=0;
	
		res=a+b;
		return res;
	}

	public int mul(int a,int b) {
		
		int res=0;
		res=(a*b);
		return res;
	}
}
