package com.idealabs.com;
public class Current_date {
	public static void main(String args[])
    {
		System.out.println("\n"+"Today calender date is Year-Month-Date");
        System.out.println("\n"+"\t"+"["+java.time.LocalDate.now()+"]"); 
        System.out.println(java.time.LocalDateTime.now());
    }
}
