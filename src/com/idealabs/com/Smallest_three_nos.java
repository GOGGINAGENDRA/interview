package com.idealabs.com;

import java.util.Scanner;

public class Smallest_three_nos {

	public static void main(String[] args) {
		int a, b, c, sml, temp;
		var idea = new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		a = idea.nextInt();
		b = idea.nextInt();
		c = idea.nextInt();
		temp = a < b ? a : b;
		sml = c < temp ? c : temp;
		System.out.println("The 1st smallest number is: " + sml);

	}
}
