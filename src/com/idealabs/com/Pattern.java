package com.idealabs.com;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		int i, j, k, n;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number of rows you want to print: ");  
		n = sc.nextInt();              
		for (i= 1; i< n ; i++)  
		{  
		for (j=1; j<i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (k=i; k<=n; k++)   
		{   
		System.out.print(k + " ");   
		}   
		System.out.println("");   
		}   
		for (i= n; i>=1; i--)  
		{  
		for (j=1; j<i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (k=i; k<=n; k++)  
		{  
		System.out.print(k + " ");  
		}  
		System.out.println("");  
		}  	
		}  
		} 

