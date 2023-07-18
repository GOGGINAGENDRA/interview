package com.interview;

import java.util.Arrays;

public class Matrix {
		static int max = 100001;
	    static boolean prime[] = new boolean[max];
	 
	    // Function to find prime numbers using sieve
	    static void find()
	    {
	        int n = max - 1;
	        Arrays.fill(prime, true);
	       
	        // Create a boolean array
	        // "prime[0..n]" and initialize
	        // all entries it as true.
	        // A value in prime[i] will
	        // finally be false if i is
	        // Not a prime, else true.
	        prime[0] = false;
	        prime[1] = false;
	 
	        for (int p = 2; p * p <= n; p++) {
	            // If prime[p] is not changed,
	            // then it is a prime
	            if (prime[p] == true) {
	                // Update all multiples
	                // of p greater than or
	                // equal to the square of it
	                // numbers which are multiple
	                // of p and are less than p^2
	                // are already been marked.
	                for (int i = p * p; i <= n; i = i + p)
	                    prime[i] = false;
	            }
	        }
	    }
	 
	    // Function to print the position and
	    // value of the primes in given matrix
	    static void printPrimes(int[][] arr, int n)
	    {
	        // Traverse the matrix
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	 
	                // Check if the element is prime
	                // or not in O(1)
	                if (prime[arr[i][j]] == true) {
	                    // Print the position and value
	                    // if found true
	                    System.out.print((i + 1));
	                    System.out.print(" ");
	                    System.out.print(j + 1);
	                    System.out.print(" ");
	                    System.out.print(arr[i][j]);
	                    System.out.println();
	                }
	            }
	        }
	    }
	 
	    // Driver Code
	    public static void main(String[] args)
	    {
	        int N = 2;
	        int arr[][] = new int[N][N];
	 
	        arr[0][0] = 1;
	        arr[0][1] = 2;
	        arr[1][0] = 2;
	        arr[1][1] = 1;
	 
	        // Precomputing prime numbers using sieve
	        find();
	 
	        // Find and print prime numbers
	        // present in the matrix
	        printPrimes(arr, N);
	    }
	    
	}

