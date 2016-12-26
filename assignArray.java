package com;

import java.util.*;

public class Test {
	public static Scanner input = new Scanner(System.in);

	public static void show(String x) {
		System.out.println(x);
	}
	
	public static void printArray(int[] array){
		
		for(int i =0; i < array.length; i++ ){
			show(array[i]+ " ");
		}
		
	}

	public static void main(String[] args) {

		// Use an array to solve the following problem:
		//
		// Write an application that inputs five numbers, each between 10 and
		// 100, inclusive.
		// As each number is read, display it only if it’s not a duplicate of a
		// number already read.
		//
		// Provide for the “worst case,” in which all five numbers are
		// different. Use the smallest
		//
		// possible array to solve this problem. Display the complete set of
		// unique values input
		//
		// after the user enters each new value.

		/* input 5 Numbers with condition between 10 - 100 */
         
		int[] nums = new int[5];
		
		show("Enter Five unique Numbers Betwee 10 & 100");
		
		for (int i = 0 ; i < nums.length;){
		 
			show("Enter Number" + (i+1));
			nums[i] = input.nextInt();
			boolean duplicate = false; 
			
			while( nums[i] <  10 || nums[i] >  100   ){
				if ( nums[i] > 100) {
					show("Too High Try Again Enter Number" + (i+1) );
				} else if ( nums[i] < 10) {
					show("Too Low Try Again Enter Number" + (i+1) );
				}
				nums[i] = input.nextInt();
	 	
			}
			
			for (int k = 0; k < i ; k++){
				if(nums[k] == nums[i] ){
					show(nums[k]+ " Already Entered Try Another one ");
					duplicate = true;
					break;
				}
			}
			if(!duplicate){
				i++;
			}

		
		}
		
		show("Your Numbers Are : ");
        printArray(nums);
        
        // to get largest Number and smallest in array 
        
        int largest= nums[0];
        int smallest= nums[0];
        
        // check loop
        for (int y = 0 ; y< nums.length; y++){
        	if(nums[y] > largest)
        		largest = nums[y];
        else if (nums[y] < smallest)
                smallest = nums[y];
       
        }
        
        show("largest Number is =>" + largest);
        show("Smallest Number is =>" + smallest);

 
	}
}
