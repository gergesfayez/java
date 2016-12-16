package com;
import java.util.Scanner;
public class Test {
   public static Scanner input;
   public static void show(String msg){
    	System.out.println(msg);
   }
	public static void main(String[] args) {
	/*	Write a Java program to detect key presses.
		If the user pressed number keys( from 0 to 9), the program will tell the number that is 
		pressed,  otherwise, program will show "Not allowed".*/
		
		// init new scanner object
	    input = new Scanner(System.in);
		//set vars
		int num ;
   
		//1st message 
 	    System.out.println("Enter Number between 0 and 9");
 	    // assign input field
 	    num = input.nextInt();
     
 	    if (num <=9){
	    	show("Success you've entered number :  " + num);
 	    }else{
 	    	show("Not allowed");
	    }
 
    	


	}
	 

}
