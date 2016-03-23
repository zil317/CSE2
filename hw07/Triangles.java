//Zihan Liu 
//CSE2 hw07 
//The purpose of this code is to use for loop, while loop and do while loop to create three number triangles
import java.util.*;
public class Triangles{
    //main method required for the every Java prgram 
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in); //declare an instance of the Scanner object
       System.out.print("Enter a number between 5 and 30: "); //ask user to input a number between 5 and 30 
       while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Error: please type in an integer. "); // if input is not an integer, ask user to input again
        }
        int x = scan.nextInt(); //cast user's input
        while(x<5||x>30){
            System.out.print("Error: please type in a integer between 5 and 30. ");// if input is not between 5 and 30, ask user to input again
            x = scan.nextInt();
        }
        
        
        int y=1; //initialize the number of rows in triangle
        int z=1; //initialize the number of numbers in each upper triangle row
        int r=1; //initialize the number of numbers in each lower triangle row
        
        for(y=1; y<=x; y++){ //control the number of rows
            for(z=1;z<y; z++){  //control how many numbers in each row
                System.out.print(y);
            }
            System.out.println(y);
        } //print out the upper triangle using for loop
            
            for(y=x-1; y>=1; y--){  //control the number of rows
                for(r=1; r<=y-1; r++){ //control how many numbers in each row
                    System.out.print(y);
                }
                System.out.println(y);
            } //print out the lower triangle using for loop
            
            
         y=1;   
        while(y<=x){
            z=1;
            while(z<y){
                System.out.print(y);
                z++;
            }
            System.out.println(y);
            y++;
        } //print out the upper triangle using while loop
        
        y=x-1;
        while(y>=1){
            r=1;
            while(r<=y-1){
                System.out.print(y);
                r++; 
            }
            System.out.println(y);
            y--;
       }// print out the lower triangle using while loop
       
      y=1;
       do{ 
           z=1;
           do{
              System.out.print(y);
              z++;
           }while(z<y);
           if(y>1){
           System.out.println(y);
           }
           if(y==1){
               System.out.println();
           }
           y++;
       }while(y<=x); // print out the upper triangle using do while loop
       
       y=x-1;
       do{
           r=1;
           do{
               System.out.print(y);
               r++;
           }while(r<=y-1);
           
            if(y>1){
           System.out.println(y);
           }
           if(y==1){
               System.out.println();
           }
        y--;
       }while(y>=1); // print out the lower triangle using do while loop
        
        
        
    }
}