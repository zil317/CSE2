import java.util.Scanner;
public class ToHex{
    			// main method required for every Java program
   			public static void main(String[] args) {

 Scanner myScanner = new Scanner(System.in ); //declare an instance of the Scanner object 
 System.out.println("Please enter three numbers representing RGB values : "); // ask users for inputs
        int R = 0;
        int G = 0;
        int B = 0; // define inputs
        
 String Rinteger="";
 String Rdecimal=""; 
 String Ginteger="";
 String Gdecimal="";
 String Binteger="";
 String Bdecimal="";  // define strings 

if (myScanner.hasNextInt()){
    R=myScanner.nextInt();
    if (myScanner.hasNextInt()) {
        G=myScanner.nextInt();
        if (myScanner.hasNextInt()){
            B=myScanner.nextInt();
//ask if inputs are integers
 if (R>=0 && R<=255 && G>=0 && G<=255 && B>=0 && B<=255){
     int R1=(int) R/16; //fist digit conversion from the input R to hex 
        switch (R1){
            case 0: 
            Rinteger="0";break;
            case 10:
            Rinteger="A";break;
            case 11:
            Rinteger="B"; break;
            case 12:
            Rinteger="C";break;
            case 13:
            Rinteger="D";break;
            case 14:
            Rinteger="E"; break;
            case 15:
            Rinteger="F";break;
            default:
            Rinteger = Integer.toString(R1);break;
             }
    int R2= (int) R%16;   //second digit conversion from the input R to hex
        switch (R2){
            case 0: 
            Rdecimal="0";break;
            case 10:
            Rdecimal="A";break;
            case 11:
            Rdecimal="B"; break;
            case 12:
            Rdecimal="C";break;
            case 13:
            Rdecimal="D";break;
            case 14:
            Rdecimal="E"; break;
            case 15:
            Rdecimal="F";break;
            default:
            Rdecimal = Integer.toString(R2);break;
            }
            
     int G1=(int) G/16; //first digit conversion from input G to hex
        switch (G1){
            case 0: 
            Ginteger="0";break;
            case 10:
            Ginteger="A";break;
            case 11:
            Ginteger="B"; break;
            case 12:
            Ginteger="C";break;
            case 13:
            Ginteger="D";break;
            case 14:
            Ginteger="E"; break;
            case 15:
            Ginteger="F";break;
            default:
            Ginteger = Integer.toString(G1);break;
             }
    int G2= (int) G%16;    //second digit conversion from input G to hex
        switch (G2){
            case 0: 
            Gdecimal="0";break;
            case 10:
            Gdecimal="A";break;
            case 11:
            Gdecimal="B"; break;
            case 12:
            Gdecimal="C";break;
            case 13:
            Gdecimal="D";break;
            case 14:
            Gdecimal="E"; break;
            case 15:
            Gdecimal="F";break;
            default:
            Gdecimal = Integer.toString(G2);break;
            }
     int B1=(int) B/16;  //first digit conversion from input B to hex
        switch (B1){
            case 0: 
            Binteger="0";break;
            case 10:
            Binteger="A";break;
            case 11:
            Binteger="B"; break;
            case 12:
            Binteger="C";break;
            case 13:
            Binteger="D";break;
            case 14:
            Binteger="E"; break;
            case 15:
            Binteger="F";break;
            default:
            Binteger = Integer.toString(B1);break;
             }
    int B2= (int) B%16;    //second digit conversion from input B to hex
        switch (B2){
            case 0: 
            Bdecimal="0";break;
            case 10:
            Bdecimal="A";break;
            case 11:
            Bdecimal="B"; break;
            case 12:
            Bdecimal="C";break;
            case 13:
            Bdecimal="D";break;
            case 14:
            Bdecimal="E"; break;
            case 15:
            Bdecimal="F";break;
            default:
            Bdecimal = Integer.toString(B2);break;
            }
 System.out.println("The decimal numbers R:"+ R +", "+"G:"+ G + ", " +"B:" + B + ", is represented in hexadecimal as: " +Rinteger + Rdecimal + Ginteger + Gdecimal + Binteger + Bdecimal);
 } // print out hex number 

 else if (R<0||R>225||G<0||G>225||B<0||B>255) {
     System.out.println("Sorry, you must enter values between 0-255.");
    }
//check if the inputs are between 0 to 255

else {
     System.out.println("Sorry, your input must consist of integers.");
    }
               }
    else {
        System.out.println("Sorry, your input must consist of integers.");
        }
           }
        else {
         System.out.println("Sorry, your input must consist of integers.");
          }
}
          else {
         System.out.println("Sorry, your input must consist of integers.");
           } //check if the input are integers

   			}  //end of main method   
  	} //end of class