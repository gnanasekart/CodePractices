package com.qa.LeafGround;

import java.util.Scanner;

public class Condtionifelse {

	private static final Scanner scanner = new Scanner(System.in);
	static int n;
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		if(n%2 == 0 || n < 20)
		{
		}
		else if(n < 2 && n > 5)
		{
			System.out.println("not weird");
		}
		else if(n > 5 && n < 20)
		{
			System.out.println("weird");
		}

		else
		{
			System.out.println("not weird");
		}
		//scanner.close();
	}
}