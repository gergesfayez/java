package com;
import java.util.Scanner;


public class Test {
    public static Scanner input;
    public static void show(String msg){
    	System.out.println(msg);
    }
	public static void main(String[] args) {
		/*
			  3- Write Java program to prompt the user to choose the correct answer from a list of answer choices of a question.
				The user can choose to continue answering the question or stop answering it. See the example below:
				What is the command keyword to exit a loop in Java?
				a. int
				b. continue
				c. break
				d. exit
				Enter your choice: b
				Incorrect!
				Again? press y to continue:
				
								  
		 */
		
		input= new Scanner(System.in);
		String q = "What is the command keyword to exit a loop in Java?";
		String a = "a.int";	
		String b = "b.continue";
		String c = "c.break";
	    String d = "d.exit";
	     
	    String  answer = "b"  ;
	    String answer2 = "B";
	 
	    show(q+"\n \n"+a+"\n"+b+"\n"+c+"\n"+d+"\n\n"+"Your Choice a, b , c or d:");
	   
	    String userAnswer = input.next();
	    
	    if(userAnswer.equals(answer)|| userAnswer.equals(answer2)){
	    	show("correct");
	    }else{
	    	show("Incorrect ! \n Again? press y to continue");
	    	userAnswer = input.next();
	    	
	    	if(userAnswer.equals("y")){
	    		show("Your Choice a, b , c or d:");
	    		userAnswer = input.next();
	    		  if(userAnswer.equals(answer)|| userAnswer.equals(answer2)){
	    		    	show("correct");
	    		    }else{ 
	    		    	show("Incorrect!");
	    		    }
	    	}else{
	    		show("bye bye !");
	    	}
	    	
	    }
	
	   
	

	}

}
