package com.idealabs.com;

import java.util.Scanner;

public class ArmStrong_no {
	static boolean as(int n)   
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=n;   
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = n;   
	while(temp>0)   
	{   
     
	last = temp % 10;   
	sum +=  (Math.pow(last, digits));   
	temp = temp/10;   
	}  
	if(n==sum)   
	return true;      
	else return false;   
	}   
	public static void main(String args[])     
	{     
	int num;   
	Scanner idea= new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	num=idea.nextInt();  
	System.out.println("Armstrong Number up to "+ num + " are: ");  
	for(int i=0; i<=num; i++)  
	if(as(i))   
	System.out.print(i+ ", ");  
	}   
	}

