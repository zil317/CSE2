//Zihan Liu
//CSE2 hw07
//The purpose of this program is to create a pattern that spread, vertically, across the screen

import java.util.*;
public class Twisty{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //declare an instance of the Scanner object
        int x=0, y=0, z=0;
        
        
    System.out.print("Input your desired length: "); // ask the user to input the length 
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Error: please type in an integer. "); // if input is not an integer, ask user to input again
        }
        x = scan.nextInt(); //cast user's input
        while(x< 0|| x>80){
            System.out.println("Error: please type in an integer between 0 to 80."); // if input is not between 0 and 80, ask user to input again
            x = scan.nextInt();
        }
        
        
        
        System.out.print("Input your desired width: "); // ask user to input the desired width
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Error: please type in an integer. "); // if input is not an integer, ask user to input again
        }
        y = scan.nextInt(); //cast user's input
        z= 2*y; //define the unit length of the pattern
        while(y< 0|| y>80){
            System.out.println("Error: please type in an integer between 0 and 80. ");//if input is not between 0 and 80, ask user to input again
            y = scan.nextInt();
        }
         while(y>x){
            System.out.println("Error: Please input an integer smaller than the length. "); // if width is bigger than length, ask user to input again
            y = scan.nextInt();
        }
    

        
        int i=0,j=0; //i controls the number of rows and j controls the pattern in a row
        
     
        for (i=0; i<y; i++){ //print out the number of rows as desired width
            
            for (j=0; j<x; j++) { // print out the length
               
                
                if (j%z==i) {
                    System.out.print("#"); // print out # from upper left to lower right 
                } 
                else if (j%z==(y-1-i)){
                    System.out.print("/"); //print out / from lower left to upper right 
                }
                else if (j%z==(y+i)){
                    System.out.print("\\"); // print out \ from upper left to lower right 
                }
                else if(j%z==(2*y-i-1)){
                    System.out.print("#"); //print out # from lower left to upper right 
                }
                else {
                    System.out.print(" "); //print out the space in between
                }
              
            }
        System.out.println(""); // to the next line
        }
        
    }
}
        