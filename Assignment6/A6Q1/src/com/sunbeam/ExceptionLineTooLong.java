package com.sunbeam;
import java.util.Scanner;

public class ExceptionLineTooLong extends Exception {
	private String string;
	private String stringName;

	public ExceptionLineTooLong() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionLineTooLong(String string, String stringName) {
		this.string = string;
		this.stringName = stringName;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getStringName() {
		return stringName;
	}

	public void setStringName(String stringName) {
		this.stringName = stringName;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [string=" + string + ", stringName=" + stringName + "]";
	}

}