package hypotenus;

import java.util.Scanner;

public class Test {
     public static Scanner input = new Scanner(System.in);
     public static void show(String x){
    	 System.out.println(x);
     }
     
     public static double getHypotenuse(double side1 , double side2){
	      return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}
	public static void main(String[] args) {
	   
		double side1 , side2 ;
	     
 	     show("Enter Triangle side 1");
	     side1 = input.nextDouble();
	     show("Enter Triangle side 2");
	     side2 = input.nextDouble();
	     
	     show(" the Hypotenus of the triangle " + getHypotenuse(side1, side2));
	     
	     
	}

}
