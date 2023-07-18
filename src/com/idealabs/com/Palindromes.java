package com.idealabs.com;

import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String s1=sc.nextLine();
	String s2="";
	int i;
    for(i=s1.length()-1;i>=0;i--) {
    	s2=s2+s1.charAt(i);
    }
    System.out.println(s2);
      if(s1.equalsIgnoreCase(s2)) {
    	  System.out.println(s1+" palindromes");
      }
      else {
    	  System.out.println(s1+" Notpalindromes");
      }
	}

}
