
//Zihan Liu 
//CSE2 hw06 Program 1
// The program prints a serie of Fibonacci numbers, which begins with two numbers and any subsequent number is the sum of the last two

import java.util.*;

public class Fibonacci{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //declare an instance of the Scanner object
        
       

    System.out.print("Entire the second number in the sequence: "); //ask user to input the second number in the sequence 
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Please enter another integer "); // if input is not an integer, ask user to input again
        }
        int x = scan.nextInt(); //cast user's input
        

    System.out.print("Entire the second number in the sequence: "); //ask user to input the second number in the sequence 
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Please enter another integer "); // if input is not an integer, ask user to input again
        }
        int y = scan.nextInt(); //cast user's input
        
        
    System.out.print("How many custom Fibonacci numbers should be printed? "); // ask input how many numbers to be printed
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Please enter another integer "); // if input is not an integer, ask user to input again
        }
        int z = scan.nextInt(); //cast user's input
        
       int i=0;
      System.out.print(x + ", " + y);
      while(i<(z-2)){ //run the loop to print Fibonacci numbers
          int w=x+y; //Define the next number printed is the sum of the first two 
          System.out.print(", "+w); //print out the result in the right format 
          x=y;
          y=w;
          i++;
      }
      System.out.print("."); // print out the result in the right format
      System.out.println(""); 
    }
}
