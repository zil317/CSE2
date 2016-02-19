
import java.util.Scanner;
public class CardGenerator{
    			// main method required for every Java program
   			public static void main(String[] args) {
   			    
int Num = (int)(Math.random()*52);
String Suit="";
String Identity=""; 
int getIdentity=0;


if (Num>=1 && Num<=13){
    Suit= "diamonds";
    getIdentity=Num;
}
else if(Num>=14 && Num<=26){
    Suit= "clubs";
    getIdentity=Num-13;
}
else if(Num>=27 && Num<=39){
    Suit= "hearts";
    getIdentity=Num-26;
}
else if(Num>=40 && Num<=52){
 Suit= "spades";
 getIdentity=Num-39;
}
switch (getIdentity){
case 1: 
    getIdentity=11;
    Identity = "ace";
    break;
case 2:
    getIdentity=12;
    Identity = "jack";
    break;
case 3:
    getIdentity=13;
    Identity="queen";
    break;
default:
 
 Identity = Integer.toString(getIdentity);
 break;
}
 System.out.println("you picked the  "+ Identity+"  of   "+ Suit);
}  //end of main method   
  	} //end of class