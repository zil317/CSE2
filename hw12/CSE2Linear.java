//Zihan Liu 
//CS2 HW12
//The purpose of this code is to sort the array and linear seach an element in the array


import java.util.*;

public class CSE2Linear{
    //main method required for the every Java prgram 
    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         
        System.out.println("Please input 15 integers ranger from 0 to 100: "); //prompt user to input 
        
        int [] array= new int[15]; //initialize an array 
        int input= 0;
        int input1= 0;
        int y=0, z=0;
        
        for (int i=0; i<15; i++){
            
            if(scan.hasNextInt()){
                input= scan.nextInt();
                if(input<0||input>100){
                    System.out.println("Not in the ranger from 0 to 100."); //If the input is out of ranger, print out error message
                }
                else if(input< input1){
                    System.out.println("The int entered is not greater than than or equal to the last integer."); //if the next input is smaller than the first input, print out error message
                }
                else{
                    array[i]=input; //accept input into the array 
                }
                input1=input;
            }
            else{
                System.out.println("The entered is not an integer"); //print out error message if input is not an integer
            }
  
        }
        
        String out1="Sorted 15 ints for final grades in CSE2: ";
  	    out1+=listArray(array); //return a string of the form "2 3 -9"  
  	    System.out.println(out1);

        
        System.out.println("Please enter a grade to search: "); // prompt user to enter a grade to search 
        y= scan.nextInt();
        int m= linear(array, y); //enter the method of linear search 
        
        int []array2=scramble(array);  //enter the method to scramble the array 
        
        String out2="Scrambled 15 ints for final grades in CSE2: ";
  	    out2+=listArray(array2); //return a string of the form "2 3 -9"  
  	    System.out.println(out2);
        
        System.out.println("Please enter a grade to search: "); //prompt user to enter a grade to search 
        z= scan.nextInt();
        int n= linear2(array2, z);
        
    }
        
        
        public static String listArray(int[] array){ 
	     String out="";
	     for(int j=0;j<array.length;j++){
	         
  	     out+=array[j];
  	     out+=" ";  //print out each element in the array 
	     }
	     out+=" ";
	     return out;
    }
        
        
        public static int linear(int[]array, int y ){
            boolean incorrectinput = true;
            int i=0;
            for(i=0; i<15; i++){
                if(y == array[i]){ //if the entered grade equal to the a grade in the array, print out the following
                      incorrectinput =false; 
                     System.out.println("The grade is found.");
                     System.out.println("The number of iterations used is: "+i);
                }
            }
            
            if (incorrectinput == true){
                System.out.println("The grade can not be found.");
            }
            return i;
            
        }

        
         public static int linear2(int[]array2, int z ){ //if the entered grade equal to the a grade in the array, print out the following
            boolean incorrectinput = true;
            int i=0;
            for(i=0; i<15; i++){
                if(z == array2[i]){
                    incorrectinput =false; 
                    System.out.println("The grade is found.");
                    System.out.println("The number of iterations used is: "+i);
                }
            }
            
            if (incorrectinput == true){
                System.out.println("The grade can not be found.");
            }
            
        
            return i;
            
        }
        
        
        
        public static int[] scramble(int[] array){ 
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(15); // generate a random number 
            
            for (int i=0; i<array.length; i++) { // scramble the array 
                
        	int temp = array[randomInt];
        	array[randomInt] = array[i];
	        array[i] = temp;
            }
        return array;
        }
}
        
        
        
        
    