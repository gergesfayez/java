package com;
import java.util.Scanner;


public class Test {
    public static Scanner input;
    public static void show(String msg){
    	System.out.println(msg);
    }
	public static void main(String[] args) {
		/*
			   2- Write a Java program that allows the user to choose the correct answer of a question.
				See the example below:
				What is the correct way to declare a variable to store an integer value in Java?
				a. int 1x=10;
				b. int x=10;
				c. float x=10.0f;
				d. string x="10";
				Enter your choice: c
				  
		 */
		
		input= new Scanner(System.in);
		String q = "What is the correct way to declare a v;ariable to store an integer value in Java?";
		String a = "a.  int 1x= 10;";	
		String b = "b. int x=10;";
		String c = "c. float x=10.0f;";
	    String d = "d. string x=\"10\";";
	     
	    String  answer = "c"  ;
	    String answer2 = "C";
	 
	    show(q+"\n \n"+a+"\n"+b+"\n"+c+"\n"+d+"\n\n"+"Your Choice a, b , c or d:");
	   
	    String userAnswer = input.next();
	    
	    if(userAnswer.equals(answer)|| userAnswer.equals(answer2)){
	    	show("correct");
	    }else{
	    	show("wrong");
	    }
	    
	   
	

	}

}
