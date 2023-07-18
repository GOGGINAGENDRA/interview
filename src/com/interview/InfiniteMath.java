package com.interview;

	public class InfiniteMath extends ComplexMath {
	    public final double secret = 8;

	    public static void main(String[] numbers) {
	        Maths math = new InfiniteMath();
	        System.out.print(math.secret);
	    }
	}