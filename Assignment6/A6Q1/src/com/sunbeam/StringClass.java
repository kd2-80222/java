package com.sunbeam;

public class StringClass {
	public String s;

	public StringClass(String s) {
		this.s = s;
	}

	public StringClass() {
		// TODO Auto-generated constructor stub
	}

	public void setS(String s) throws Exception {
		if (s.length() > 80) {
			throw new ExceptionLineTooLong(s,"The strings is too long");
		} else
			this.s = s;
	}

	@Override
	public String toString() {
		return "StringClass [s=" + s + "]";
	}

}