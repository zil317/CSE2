//Zihan Liu
// CSE hw09
// The purpose of this program is to design three games: guessTheBox, spinTheWheel and scrambler.


import java.util.*;
public class Games{
    //main method required for the every Java prgram 
    
public static void main(String[] args){ //The main method
    String input=""; // define varibale input
    System.out.println("Welcome to Maggie's Game Center"); // print out the welcome message
    Scanner scan= new Scanner(System.in);

       System.out.println("Please choose one of the following three games: guessTheBox, spinTheWheel and scrambler: "); // ask user to input the game that they want to play
       input= scan.next(); //take user's input 
       
             switch (input){
        case "guessTheBox": 
            input = guessTheBox(scan, "Prize"); // if user choose game guessTheBox, run method guessTheBox
            break;
            
        case "spinTheWheel":
            input= spinTheWheel(scan, "Prize"); // if user choose game spinTheWheel, run method spinTheWheel
            break;
            
        case "scrambler":
            input = scrambler(scan,"Prize"); //if user choose game scrambler, run method scrambler 
            break;
            
        default: 
        System.out.println("Sorry, our arcade does not have the game you entered! "); //Error messgae if user did not choose any of the three games
             }
    
}
  
public static String guessTheBox(Scanner scan, String Prize){
    
    int x=0; int randomInt1=0; int randomInt2=0; //define all variables
    System.out.println("Please enter number 1 or 2 or 3: "); // ask user to input a number between 1, 2 and 3
     
    while(!scan.hasNextInt()){
        scan.next();
        System.out.println("Input another number: "); // if user's input is not an integer, ask for input again
    }
    x = scan.nextInt();
    while(x<1||x>3){
        System.out.println("Please enter number 1 or 2 or 3: "); //if user's input is not between 1 to 3, ask for input again
        x = scan.nextInt();
    }
     
    
    Random randomGenerator = new Random();  // generate a random number 
        randomInt1 = randomGenerator.nextInt(3);
        randomInt2 = randomInt1+1; //generate a random number between 1 to 3, representing the box number
        Prize= "";  
        if (x==randomInt2){ // if user's input equal to the box number, return to the following
        switch (randomInt2){
            case 1:
                Prize= "Congratulations, you won an iphone 6s!"; // print out the prize in box 1
                break;
            case 2: 
                Prize= "Congratulations, you won a stuffed animal!"; //print out the prize in box 2
                break;
            case 3:
                Prize= "Congratulations, you won a box of candies!"; //print out the prize in box 3
                break;
        }
        }
        else{
            System.out.println("Thanks for participating!"); // if user's input does not equal to the box number, print out the message
        }
        System.out.println(Prize);
        return Prize;
        
    
}

public static String scrambler(Scanner scan, String Prize){
  int randomInt=0; int randomTime=0; //define all variables

    System.out.println("Please enter a word: ");  // ask user to enter a word
    String originalString = scan.next();
    String newString = originalString;
    Random randomGenerator = new Random(); //generate a random number between 0 to 9 to swap random number of times
    randomTime = randomGenerator.nextInt(10);
    
    for (int i=0; i<=randomTime; i++){
        
    int length = newString.length( ); //define the number of letters in the word 
    char firstletter = newString.charAt(0); // define the first letter in the word
    
    String substring1 = newString.substring(1, length); // define the rest of the word as string 
    newString = substring1 +firstletter; //the new word swaps the first letter and the rest of the word
    }
    System.out.println(newString); //print out the new word
return Prize;
    
}

public static String spinTheWheel(Scanner scan, String Prize){
     int x=0; String y=""; int randomNum=0; 
     int RandomColor=0; String color=""; String Capcolor="";  //define all variables
     boolean incorrectinput = true;
     
     while(incorrectinput){
         System.out.println("Please enter a color between red and black: "); // ask user to enter a word between red and black
         y= scan.next();
         if (y.equals("red")||y.equals("black")||y.equals("Red")||y.equals("Black")){ //if user enter a word between red and black, end the while loop
             incorrectinput = false;
         }
     }
    
    
    System.out.println("Please enter a number between 1 to 5: "); // ask for user to enter a number between 1 to 5
     while(!scan.hasNextInt()){ // if the input is not an integer, ask for input again
        scan.next();
        System.out.println("Input another number.");
    }
    x = scan.nextInt();
     while(x<1||x>5){ // if the input is not between 1 and 5, ask for input again
        System.out.println("Please enter number between 1 to 5: ");
        x = scan.nextInt();
    }
    Random randomGenerator = new Random();
        RandomColor =randomGenerator.nextInt(2); //generate a random number between 0 and 1
        if (RandomColor==0){ // random number 0 represents that the spin is red
            Capcolor= "Red";
            color= "red";
        }
        if (RandomColor==1){ //random number 1 represents that the spin is black
            Capcolor = "Black";
            color = "black";
        }
        randomNum = randomGenerator.nextInt(5)+1; // generate a random number representing the spin number
        System.out.println("The result of the spin is "+ color + " "+ randomNum); // print out the result of the spin
        
        if((y.equals("color")||y.equals("Capcolor"))&& (x==randomNum)) { 
            System.out.println("Congratulations, you guess matches with the result of the spin!");// if the user's input matches with the spin result, print out congratulation messgae
        }
        else{
            System.out.println("Thanks for participating!");// if not, print out another messge
        }

    return Prize;
    
    
}

}