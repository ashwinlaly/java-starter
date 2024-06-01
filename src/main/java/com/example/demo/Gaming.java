package com.example.demo;

abstract class Animal {
	abstract void man();
	void eat() {
		System.out.println("hi");
	}
}

class Lion extends Animal{
	void man() throws NullPointerException {
		throw new ArithmeticException("hi");
	}
	
	void eat() {
		System.out.println("hi2");
	}
}

public class Gaming {	
	public static void main(String[] args) {
		try {
			var m = new Mario();
			var v = new Contra();
			var game = new AppRunner(m);
			game.run();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
