package net.jhayden.tmvpofed.util;

public class Strings {
	public static String trim(Object o) {
		return (o == null) ? "" : o.toString().trim();
	}
	
	private Strings() {
		super();
	}

	public static String requireNonEmpty(Object input, String context) {
		String s = trim(input);
		if (s.isEmpty()) {
			throw new IllegalArgumentException(context);
		}
		return s;
	}
}
