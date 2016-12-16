package com;
 import java.util.Scanner;
 
public class Test {
    public static Scanner input;
	
	public static float mpg(int x , int y ){
		return (float) x / y;
		  
	}
	public static void main(String[] args) {
	 /*
	  * Drivers are concerned with the mileage their automobiles get. One driver has

kept track of several trips by recording the miles driven and gallons used for each tankful. 

Develop a Java application that will 
input the miles driven and gallons used (both as integers) for each trip.

The program should calculate and display the miles per gallon obtained for each trip and 
print the combined miles per gallon obtained for all trips up to this point. 

All averaging calculations should produce floating-point results.
Use class Scanner and sentinel-controlled repetition to obtain the data from the user.
	  */
		input = new Scanner(System.in);
		
		int miles;
		int gallons;
		 float mpg;
		 float mpgAll = 0; 
		 int milesAll = 0;
		 int gallonsAll = 0;

	      for(int i = 1; i <3; i++) {
		         
		   
	    		System.out.println("Enter Trip" + i +" Miles drived: ");
	    		
				miles= input.nextInt();
				
				System.out.println("Enter Gallons used for Trip " + i +" : ");
				
				gallons = input.nextInt();
				
				mpg = mpg(miles, gallons);
 				System.out.println("Miles Per Gallons for this trip #"+i + " is = " + mpg);
 			    System.out.println("--------------------");
			    milesAll= milesAll + miles;
			    mpgAll = mpgAll + mpg; 
			    gallonsAll = gallonsAll + gallonsAll;
		        System.out.println("Miles Per Gallons for all " + i +" trips  so far  = " + mpgAll);
		        System.out.println("--------------------");

		   }
			    
		       System.out.println("You've drived " + milesAll + " & used " + gallonsAll +" gallons");
	           System.out.println("Miles Per Gallons for all trips  is = " + mpgAll);

	 
		
	}

 
	

}
