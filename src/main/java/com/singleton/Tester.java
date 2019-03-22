package com.singleton;

public class Tester {

	public static void main(String[] args) {
		A a = new A();
		A a1 = new B();
		B b = new B();
		B b1 = new A(); // not possible
		b.methodB();
	}

}
