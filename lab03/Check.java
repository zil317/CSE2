//
//
//
import java.util.Scanner;
public class Check{
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner = new Scanner(System.in ); //declare an instance of the Scanner object 

System.out.print("Enter the original cost of the check in the form xx.xx: "); //prompt the user for the original cost of the check
double checkCost = myScanner.nextDouble(); //accept the user input
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );  //prompt the user for the tip percentage that they wish to pay and accpet the input
double tipPercent = myScanner.nextDouble(); // accept the user input 
tipPercent /= 100; //We want to convert the percentage into a decimal value
System.out.print("Enter the number of people who went out to dinner: "); //prompt the user to enter the number of people
int numPeople = myScanner.nextInt(); //accept the user input
double totalCost; //define total cost
double costPerPerson; //define the cost per person
int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
          //to the right of the decimal point 
          //for the cost$ 
totalCost = checkCost * (1 + tipPercent);
costPerPerson = totalCost / numPeople;
//get the whole amount, dropping decimal fraction
dollars=(int)costPerPerson;
//get dimes amount, e.g., 
// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
//  where the % (mod) operator returns the remainder
//  after the division:   583%100 -> 83, 27%5 -> 2 
dimes=(int)(costPerPerson * 10) % 10;
pennies=(int)(costPerPerson * 100) % 10;
System.out.println("Each person in the group owes $" + dollars + '.'+ dimes + pennies); //print out the final cost of each person

}  //end of main method   
  	} //end of class