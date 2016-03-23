

import java.util.*;
public class check{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //declare an instance of the Scanner object
        int x=0, y=0, z=0;
        
System.out.print("Enter the first number in the sequence: "); //ask user to input the second number in the sequence 
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Please enter another integer "); // if input is not an integer, ask user to input again
        }
        x = scan.nextInt(); //cast user's input
        while(x< 0){
            System.out.println("Must enter a number greater than 0");
            x = scan.nextInt();
        }
    }
    }

