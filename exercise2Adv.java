package com;
import java.util.Scanner;
public class Test {
   //declaring global scanner class
    public static Scanner input = new Scanner(System.in);
    //system out print method
    public static void show(String x){
    	System.out.print(x);
    }
    //method calculate  Miles per gallons
    public  static float mpgCalc( int x ,  int y){
    	float z = (float) x /  y;
    	return z;
    }
    
	public static void main(String[] args) {
 		
 		
		// Variables declaration & initialization
		int miles , milesAll , gas , gasAll, i ;
		float mpg , mpgAll;
		miles =0;
		gas =0 ;
		mpgAll = 0;
		milesAll = 0;
		gasAll =0;
		
		// for loop .. for Each Trip 
		for(i= 1 ; i<= 3 ; i++){
			// Prompt a trip data and should be greater than 0
		    show("For Trip (" + i + ") Enter: \n");
		    
		    show("Miles Driven : \n");
		    
		    miles = input.nextInt();
			
			// should be greater than 0
		    while(miles <= 0 ){
		    	  show("Wrong Entry , Try Again Enter Miles Driven: \n");
			  miles = input.nextInt();
		    }
		    
		    
			show("Gallons used :\n");
			gas = input.nextInt();
			// should be greater than 0
		    while(gas <= 0){
		    	show("Wrong Entry , Try Again Enter Gallons used :\n");
			gas = input.nextInt();
		    }
		    
	      // calculate mpg for this Trip
		   mpg= mpgCalc(miles , gas);
		   
		   show(" your average miles per gallons for trip (" + i + ") is : "+ mpg + "\n\n");
		   
		   // calculate total results 
		   mpgAll = mpg + mpgAll;
		   milesAll = miles+ milesAll;
		   gasAll = gas + gasAll;
		}
		
		show("Total miles driven:" + milesAll  + "\n");
		show("Total gas used    :" + gasAll  + "\n");
		show("Total Average MPG :" + mpgAll  + "\n");
	   
		

	}

}
