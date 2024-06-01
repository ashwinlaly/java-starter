package com.example.demo;

public class AppRunner {
//	private Mario game;
	private GameNavigation gameNavigation;
	
	AppRunner(GameNavigation mario) {
		gameNavigation = mario;
	}

	void run() {
		gameNavigation.up();
	}
	
}
