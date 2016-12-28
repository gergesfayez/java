package com;

import java.util.*;

public class Booking {
	public static Scanner input = new Scanner(System.in);

	public static void show(String msg) {
		System.out.println(msg);
	}

	int[] seats ;
  
	
	public Booking(int seatsNum){
		seats = new int[seatsNum];
	}
	public boolean checkEmpty(int seatsClass) {
		if (seatsClass== 1 ){
			for (int i = 0; i < seats.length;) {
				
			}
		}else if (seatsClass ==2){
			
		}
			return true;
	}

	public void bookClassB() {
		boolean empty = true;
		for (int i = 0; i < seats.length;) {

			if (seats[i] < 5 && seats[i] == 0) {
				seats[i] = i;
				show("Success! your Seat Number is " + seats[i]);
				break;

			} else if (seats[i] > 6 && seats[i] == 0) {
				show("Sorry! Economy Full. \n Do you Want to Book Class A Seat Y  or N ?");
				String userAnswer = input.next();
				if (userAnswer.equals("y")) {
					bookClassA();
				} else {
					show("Next flight leaves in 3 hours.");
				}
			} else if (seats[i] != 0) {
				empty = false;

			}

			if (!empty) {
				i++;
			}
		}

	}

	public void bookClassA() {
		boolean empty = true;
		for (int i = 0; i < seats.length;) {
			if (seats[i] >= 10 && seats[i] == 0) {
				seats[i] = i;
				show("Success! your Seat Number is " + seats[i]);
				break;
			} else if (seats[i] > 6 && seats[i] == 0) {
				show("Sorry! Class A Full. \n Do you Want to Book at An Economy Seat Y  or N ?");
				String userAnswer = input.next();
				if (userAnswer.equals("y")) {
					bookClassB();
				} else {
					show("Next flight leaves in 3 hours.");
				}
			} else if (seats[i] != 0) {
				empty = false;
				show("Sorry! Next flight leaves in 3 hours.");
			}

			if (!empty) {
				i++;
			}
		}
	}

}
//////////////////////////////////////////////////
////////////////////////////////////////
/////////////////////


package com;

import java.util.Scanner;

public class BookingTest {
	public static Scanner input = new Scanner(System.in);

    public static void show(String msg){
    	System.out.println(msg);
    }
	public static void main(String[] args) {
	  // variables used 
		 
		Booking  flightA = new Booking(10);
 
			show(" if You Want to Book Class A seat press 1 or Class B press 2  or 3 to quit ");
	    	  int userAnswer = input.nextInt();
			  
			if(userAnswer == 1){
				flightA.bookClassA();
				show(" if You Want to Book More Class A seat press 1 or 3 to quit ");
				 userAnswer = input.nextInt();
				
			}else if (userAnswer==2){
				flightA.bookClassB();
			}else {
				show("matgeesh hena tany");
			}
 
	}

}
