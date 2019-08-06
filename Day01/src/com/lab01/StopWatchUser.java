package com.lab01;

import java.util.Scanner;

public class StopWatchUser {

	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		System.out.println("Press 1 to start and 0 to stop");
		Scanner scanner = new Scanner(System.in);
		int input = -1;
		while(input != 2) {
			input = scanner.nextInt();
			if(input == 1) {
				if(!sw.hasStarted()) {
					sw.start();
				}
			}
			else if(input == 0) {
				if(sw.hasStarted()) {
					sw.stop();
					System.out.println("Stopwatch ran for " + sw.getCounter() + " seconds");
					System.exit(0);
				}
			}			
		}

	}

}
