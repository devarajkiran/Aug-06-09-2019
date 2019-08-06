package com.lab01;

import java.io.IOException;

public class MonkeyUser {

	public static void main(String[] args) throws IOException {
		Monkey monkey = new Monkey();
		monkey.move();
		System.in.read();
		monkey.goToSleep();
	}

}
