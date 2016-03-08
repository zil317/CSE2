//Zihan Liu 
//hw06 Program 1
// The program prints a serie of Fibonacci numbers, which begins with two numbers and any subsequent number is the sum of the last two

import java.util.*;

public class Fibonacci{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=0, y=0, z=0;
        boolean correctinput = false;
        

     while(!correctinput){
         
      System.out.print("Enter the first number in the sequence: "); 
            if(scan.hasNextInt()){
            x = scan.nextInt();
            if(x>0){
                correctinput=true;
            }
            }
             else{
                System.out.println("Please enter another integer");
               scan.next();
             }
     }
             
             
    while(!correctinput){   
        
      System.out.print("Enter the second number in the sequence: "); 
            if(scan.hasNextInt()){
            x = scan.nextInt();
            if(y>0){
                correctinput=true;
            }
            }
             else{
                  System.out.println("Please enter another integer");
               scan.next();
             }
    }
             
    while(!correctinput){      
     System.out.print("Enter the third number in the sequence: "); 
            if(scan.hasNextInt()){
            z = scan.nextInt();
            if(z>0){
                correctinput=true;
            }
            }
             else{
                  System.out.println("Please enter another integer");
               scan.next();
             }
     }
        
    if(correctinput){
  
      int i=0;
      System.out.print(x + ", " + y);
      while(i<(z-2)){ //run the loop to print Fibonacci numbers
          int w=x+y; //Define the next number printed is the sum of the first two 
          System.out.print(", "+w);
          x=y;
          y=w;
          i++;
      }
      System.out.print(".");
      System.out.println("");    
    }

    
}
}

        

        
   