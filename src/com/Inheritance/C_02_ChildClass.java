package com.Inheritance;

public class C_02_ChildClass extends C_01_BaseClass {
	
	public void mul(){
		System.out.println("Multiplication is 250");
	}
	public void div() {
		System.out.println("Division is 100");
	}

	public static void main(String[] args) {
		C_02_ChildClass obj1= new C_02_ChildClass();
		obj1.add();
		obj1.subs();
		obj1.mul();
		obj1.div();
		System.out.println("======================");
		
		C_01_BaseClass obj2 = new C_01_BaseClass();
		obj2.add();
		obj2.subs();
		System.out.println("======================");
		

	}

}
