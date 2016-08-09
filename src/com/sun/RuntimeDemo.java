package com.sun;

public class RuntimeDemo {

	static class Message extends Thread {
		public void run() {
			System.out.println("Bye.");
		}
	}

	public static void main(String[] args) {
		try {

			Runtime.getRuntime().addShutdownHook(new Message());

			System.out.println("Program is starting...");

			System.out.println("Waiting for 3 seconds...");
			Thread.sleep(3000);

			System.out.println("Program is closing...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}