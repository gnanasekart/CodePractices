package javaProgram;

public class RegEx {

	public static void main(String[] args) {
		String mark = "175/3";

		System.out.println(mark.replaceAll("[^0-9]\\d", ""));
	}

}
