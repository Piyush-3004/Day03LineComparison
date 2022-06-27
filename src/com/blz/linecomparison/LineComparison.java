package com.blz.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Welcome To Line Comparison Computation Programs");

//      point coordinates		
		long x1 = 0, x2 = 0, y1 = 0, y2 = 0;

		double len1;

		len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Length of line is : " + len1);

		System.out.println("Enter coordinates to check if the line is equalto line1 one");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1");

		int nx1 = sc.nextInt();

		System.out.println("enter y1");

		int ny1 = sc.nextInt();

		System.out.println("enter x2");

		int nx2 = sc.nextInt();

		System.out.println("enter y2");

		int ny2 = sc.nextInt();
		
		sc.close();

		double len = Math.sqrt((nx2 - nx1) * (nx2 - nx1) + (ny2 - ny1) * (ny2 - ny1));

		System.out.println("distanc : " + len);
		Double lengthOne = len1;
		Double lengthTwo = len;

		if (lengthOne.equals(lengthTwo)) {
			System.out.println("Line 2 is equal to line one");
		}

	}
}
