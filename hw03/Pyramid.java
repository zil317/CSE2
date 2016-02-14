//prompt the user to input the dimension of pyramid and return the volume of the pyramid

import java.util.Scanner; //import scanner class
public class Pyramid{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
Scanner myScanner = new Scanner( System.in ); //declare an instance of the Scanner class
System.out.print("The square side of the pyramid is (input length): "); //prompt user to input the length
double Length = myScanner.nextDouble(); //accept user's input of length 
System.out.print("The height of the pyramid is (input height):"); // prompt user to input the height
double Height = myScanner.nextDouble(); //accept user's input of height
double Volume = (Length * Length * Height)/3; // calculate the volume 
int V= (int) Volume;  //convert the value to an integer



System.out.println("The volume inside the pyramid is: " + V + '.'); // print out the answer

}  //end of main method   
  	} //end of class
