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
            while(!scan.hasNextInt()){
                scan.next();
                System.out.println("The entered is not an integer"); //print out error message if input is not an integer
            }
            input= scan.nextInt();
            while(input<0||input>100){
                System.out.println("Not in the ranger from 0 to 100."); //If the input is out of ranger, print out error message
                input= scan.nextInt();
            }
  
            while(input< input1){
                System.out.println("The int entered is not greater than than or equal to the last integer."); //if the next input is smaller than the first input, print out error message
                input= scan.nextInt();
            }
            array[i]=input; //accept input into the array 
            input1=input;
            
        }
        
        String out1="Enter 15 ascending ints for final grades in CSE2: ";
  	    out1+=listArray(array); //return a string of the form "2 3 -9"  
  	    System.out.println(out1);

        
        System.out.println("Please enter a grade to search: "); // prompt user to enter a grade to search 
        y= scan.nextInt();
        binarysearch(array, y); 
        
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
        

        
        public static void binarysearch (int[]array, int y) { //binary search the grade in the sorted array
            int low=0;
            int high= array.length-1;
            int mid=0;
            int i=0;
            
            while(high >= low){
                mid = (low + high)/2;
                if(y < array[mid]){
                    high = mid -1;
                }
                else if(y == array[mid]){
                   System.out.println(y+" was found in the list with "+i+" iterations.");
                   break;
                }
                else{
                    low = mid+1;
                }
               i++;
            }
           if(array[mid]!=y){
                System.out.println(y+" was not found in the list with "+i+" iterations");
            } 
            
        }
        
        
         public static int linear2(int[]array2, int z ){ //if the entered grade equal to the a grade in the array, print out the following
            boolean incorrectinput = true;
            int i=0;
            for(i=0; i<15; i++){
                if(z == array2[i]){
                    incorrectinput =false; 
                    System.out.println(z + " was found in the list with "+i+" iterations.");
                }
            }
            
            if (incorrectinput == true){
                System.out.println(z + " was not found in the list with "+i+" iterations.");
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
        
        
        
        
    