package com.idealabs.com;

public class Find_odd_even {
	 public static void main(String[] args) {  
	        int rows, cols, codd = 0, ceven = 0;  
	          
	        int a[][] = { {4,1,3,12,15},{3,5,7,9,32},{8,2,6,13,56} };   
	          rows = a.length;  
	        cols = a[1].length; 
	        for(int i = 0; i < rows; i++){  
	            for(int j = 0; j < cols; j++){  
	              if(a[i][j] % 2 == 0)  
	                ceven++;  
	              else  
	                codd++;  
	            }  
	        }  
	          
	        System.out.println("Frequency of odd numbers: " + codd);  
	        System.out.println("Frequency of even numbers: " + ceven);  
	    }  
	}  

