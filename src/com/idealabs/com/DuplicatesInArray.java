package com.idealabs.com;

import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int arr2[] = { 2, 4, 5 };
		int n = arr1.length + arr2.length;
		int[] result = new int[n];
		int pos = 0;
		int i,j,k;

		for (i = 0; i < arr1.length; i++) {
			result[pos] = arr1[i];
			pos++;
		}
		
		for (j = 0; j < arr2.length; j++) {
			result[pos] = arr2[j];
			pos++;
		}
			System.out.print(Arrays.toString(result));
	}

}
