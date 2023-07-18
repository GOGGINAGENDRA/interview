package com.interview;

import java.io.*;

public class Checked {
	public static void main(String[] args) {
		try {
			FileInputStream b = new FileInputStream("C:/Users/min/tiger/java.txt");
			System.out.println("hii");
			int i = 0;
			while ((i = b.read()) != -1)
				System.out.println((char)i);
			b.close();
		} catch (IOException e) {
			System.out.println(e);

		}
	}
}
