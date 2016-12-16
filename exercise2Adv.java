package com;
import java.util.Scanner;
public class Test {
    public static Scanner input;
    public static void show(String x){
    	System.out.print(x);
    }
    
    public  static float mpgCalc( int x ,  int y){
    	float z = (float) x /  y;
    	return z;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		input = new Scanner(System.in);
		
		
		int miles , milesAll , gas , gasAll, i ;
		float mpg , mpgAll;
		
		mpgAll = 0;
		milesAll = 0;
		gasAll =0;
		for(i= 1 ; i<= 3 ; i++){
			do{
			    show("Enter Miles Driven : \n");
				miles = input.nextInt();
				show("Enter Gallons used :\n");
				gas = input.nextInt();
			 show("\n\n");
			} while(miles <= 1 && gas<= 1);
			
		   mpg= mpgCalc(miles , gas);
		   
		   show(" your average miles per gallons for trip (" + i + ") is : "+ mpg + "\n");
		   mpgAll = mpg + mpgAll;
		   milesAll = miles+ milesAll;
		   gasAll = gas + gasAll;
		}
		
		show("Total miles       :" + milesAll  + "\n");
		show("Total gas         :" + gasAll  + "\n");
		show("Total Average MPG :" + mpgAll  + "\n");
	   
		

	}

}
