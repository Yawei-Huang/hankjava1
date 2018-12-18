package com.tom;

public class StringTester {

	public static void main(String[] args) {
		
		
		String s1 = new String("Hello World");
		String s2 = new String("Jack Tom Eric ");
		System.out.println(s1.equals(s2));
		System.out.println(s1.substring(3,6));
		
		for(int i= s1.length()-1; i >=0; i--){
			System.out.print(s1.charAt(i));
	}
		System.out.println(s2.indexOf('c'));
		
		String name = "Tom";
		int index = s2.indexOf(name);
		System.out.println(index);
		System.out.println(s2.substring(0,index)+ "boss" + s2.substring(index+name.length()));
		
		int nn = Integer.parseInt("12");
		float f = Float.parseFloat("55.3");
		nn++;
		System.out.println(nn);
		
}
}
