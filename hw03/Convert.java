
// convert meters to inches 
import java.util.Scanner; //import scanner class
public class Convert{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
Scanner myScanner = new Scanner( System.in ); //declare an instance of the Scanner class
System.out.print("Enter the distance in meters: "); //prompt user to input the distance in meters
double DistanceInMeters = myScanner.nextDouble(); //accept user's input
double DistanceInInches=DistanceInMeters * 39.3700787; //convert meters in inches
int BeforeDecimal, 
FirstDecimal, SecondDecimal, ThirdDecimal, FourthDecimal; 
//define integer, first digit, second digit, third digit and fourth digit 

BeforeDecimal=(int)DistanceInInches; // get the integer part of the conversion 
FirstDecimal=(int)(DistanceInInches * 10) % 10;
SecondDecimal=(int)(DistanceInInches * 100) % 10;
ThirdDecimal= (int)(DistanceInInches * 1000) % 10;
FourthDecimal=(int)(DistanceInInches * 10000) % 10; //get the decimals of the conversion 
System.out.println(DistanceInMeters + " meters is " + BeforeDecimal + '.' + FirstDecimal + SecondDecimal + ThirdDecimal + FourthDecimal);
// print out the answer

}  //end of main method   
  	} //end of class
