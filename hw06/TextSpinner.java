//Zihan Liu 
//CSE2 hw06 Program3
//The program is used to create a "spinner" that is used to indicate progress

import java.util.Scanner;
public class TextSpinner{
    			// main method required for every Java program
   			public static void main(String[] args) {

 Scanner myScanner = new Scanner(System.in ); //declare an instance of the Scanner object
 while(true){  //infinite while loop
     System.out.print("\b/"); //first print /
     System.out.print("\b-"); //then print -
     System.out.print("\b\\"); //then print \
     System.out.print("\b|"); //then print |
     
 }
   			}
}