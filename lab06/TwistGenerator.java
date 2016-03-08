//Zihan Liu 
//3/6/2016 
//The purpose of this program is to print out a simple "twist" on the screen

import java.util.*;

public class TwistGenerator{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        System.out.print("Enter a positive integer called length");
     Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()){
            scan.next();
            System.out.print("Please enter another integer");
        }
        int length = scan.nextInt();
        int x = (int)(length/3);
        int y = (int)(length%3);
        if (length>3){
            
           for(int i=0; i<x; i++){
            System.out.print("\\ /");
           }
            switch (y){
                case 1: System.out.print("\\ "); break;
                case 2: System.out.print("\\ /"); break;
                case 3: System.out.print("\\ /"); break;
            }
            System.out.println("");
           for(int i=0; i<x; i++){
            System.out.print(" x ");
           }
            switch (y){
                case 3: System.out.print(" x "); break;
            }
             System.out.println("");
           for(int i=0; i<x; i++){
            System.out.print("/ \\"); 
           }
            switch (y){
                case 1: System.out.print("/ "); break;
                case 2: System.out.print("/ \\"); break;
                case 3: System.out.print("/ \\"); break;
            }
           
        }
        else{
            System.out.print("not in the range");
        }
            
            
            }
            
            
            
            
        }
       
            