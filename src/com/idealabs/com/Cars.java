package com.idealabs.com;

	abstract class Cars {
	    static {
	        System.out.print("1");
	    }

		public Cars(String s) {
			super();
	        System.out.print("2");
		}

	    {
	        System.out.print("3");
	    }
	}

