package com.interview;

import java.util.Scanner;

public class Mini {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int sum=0;
		int div=0;
		int temp=0;
		while(n>0) {
			temp=n/10;
			count++;	
		}
		System.out.println(n);
	}

}
