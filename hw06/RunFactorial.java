//Zihan Liu 
//CSE2 hw06 Program2
//The program takes input from user and calculate the factorial of the input number

import java.util.*;

public class RunFactorial{
    //main method required for the every Java prgram 
    public static void main(String[] args){
         System.out.print("Please enter an integer that is between 9 and 16"); //ask user to input a number 
     Scanner scan = new Scanner(System.in); //declare an instance of the Scanner object
      
  boolean incorrectinput = true;
  while (incorrectinput){
      if(scan.hasNext()){ //To ask for input that is integer 
          int x = scan.nextInt(); //cast the input from user
          int y =(int)x;
          if(x<9 || x>16){    
              System.out.println("Invalid input, enter again");  //to ask for an integer that is less than 9 and greater than 16
              }
              else{
                  incorrectinput = false;
                  while(x>1){  //calculate the factorial of the input
                      y=y*(x-1);
                      x=x-1;
                  if(x==2){  //End the while loop if x reaches 2
                      break;
                  }   
                  }
                  System.out.println("input accepted: "+ y); //print out the answer
              }
      }
      else{
          scan.next();
          System.out.println("Invalid input, enter again"); //ask for another input that is number 
      }
  }
  
    }
}