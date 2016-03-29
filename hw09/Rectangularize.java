//Zihan Liu
//hw09 Rectangularize
//This program will have two methods that both return void and have the same name.  
//One method will accept and int and the other will accept a string. 

import java.util.*;
public class Rectangularize{
    //main method required for the every Java prgram 
    
public static void main(String[] args){
    Scanner scan= new Scanner(System.in);
    int number=0; String input=""; int length= 0; //define all variables 
    System.out.println("Please enter here!"); // ask user for input 
    if(scan.hasNextInt()){ //if input is an integer, define the input as an integer
        number= scan.nextInt(); 
    }
    else{ //if not, define the input as a string 
    
    input= scan.next();
    length = input.length( );
    }
    
    
    input= string(scan, input, length); // run method string if input is a string 
    number= integer(scan, number); // run method integer if input is an integer
    
    
}

public static String string (Scanner scan, String input, int length){ //the method only accept string 

    for(int i=1; i<=length; i++){ //print the string out the same number of times as there are characters in the string 
        System.out.println(input);
    }
    return input;
}

public static int integer (Scanner scan, int number){ //the method only accept integer
    
    for(int j=1; j<=number; j++){ // print out a square of % characters with length and width of the number that provided as input
        for(int k=1; k<=number; k++){
           System.out.print("%");
        }
        System.out.println("");
        
    }
    return number;
    
}
    
}
