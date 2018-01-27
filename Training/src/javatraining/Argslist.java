package javatraining;

import java.util.Scanner;

public class Argslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("1st no is " + x);
		int y = sc.nextInt();

		System.out.println("2nd no is " + y);
		int z = x + y;

		System.out.println("--------------------");
		System.out.println("Sum is " + z);

		System.out.println("--------------------");
		int d = Integer.parseInt("2");
		
		System.out.println(d);
		
	}

}
