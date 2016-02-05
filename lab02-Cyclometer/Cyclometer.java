//Zihan Liu
//2/5/2016
//CSE2 lab 2 
//The purpose of this program is to create a bicycle cyclometer
//to record the time elapsed in seconds and the number of rotations of the front wheel 
public class Cyclometer{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        
  

int secsTrip1=480; //the amount of time in the first trip
int secsTrip2=3220; //the amount of time in the second trip 
int countsTrip1=1561; //the number of counts in the first trip
int countsTrip2=9037; //the number of counts in the second trip 

double wheelDiameter=27.0, //the diamter of each wheel
PI=3.14159, //the numerical value of pi
feetPerMile=5280, //the unit conversion between feet and mile
inchesPerFoot=12, //the unit conversion between inch and foot
secondsPerMinute=60; //the unit conversion between second and minute
double distanceTrip1, distanceTrip2,totalDistance; //define the distance of trip1, trip2, and total distance
System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");

//run the calculations; store the values. 
//
//
distanceTrip1=countsTrip1*wheelDiameter*PI;
//above gives distance in inches 
//(for each count, a rotation of the wheel travels 
//the diamter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles 
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //Gives in trip 2 by calculation of counts and wheel diameter
totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles"); //print out the distance of trip 1 by adding the distance
System.out.println("Trip 2 was "+distanceTrip2+" miles");//print out the distance of trip 2 by adding the distance
System.out.println("The total distance was"+totalDistance+" miles"); //print out the total distance by adding distance

  }// end of main method
}// end of class