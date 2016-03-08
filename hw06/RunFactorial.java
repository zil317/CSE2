

import java.util.*;

public class RunFactorial{
    //main method required for the every Java prgram 
    public static void main(String[] args){
         System.out.print("Please enter an integer that is between 9 and 16");
     Scanner scan = new Scanner(System.in);
      
  boolean incorrectinput = true;
  while (incorrectinput){
      if(scan.hasNextInt()){
          int x = scan.nextInt();
          int y =(int)x;
          if(x<9 || x>16){
              System.out.println("Invalid input, enter again");
              }
              else{
                  incorrectinput = false;
                  while(x>1){
                      y=y*(x-1);
                      x=x-1;
                  if(x==2){
                      break;
                  }   
                  }
                  System.out.println("input accepted: "+ y);
              }
      }
      else{
          scan.next();
          System.out.println("Invalid input, enter again");
      }
  }
  
    }
}