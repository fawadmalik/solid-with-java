package com.e2eqa.solidwithjava.hr.logging;

public class ConsoleLogger {
	public void writeInfo(String msg) {
		System.out.println("Info: " + msg);
	}
	
	public void writeError(String msg, Exception ex) {
		System.err.println("Err: " + msg + ";" + ex);
	}
}
