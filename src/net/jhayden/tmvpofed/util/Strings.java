package net.jhayden.tmvpofed.util;

public class Strings {
	private Strings() {
		super();
	}
	
	public static String trim(Object o) {
		return (o == null) ? "" : o.toString().trim();
	}
}
