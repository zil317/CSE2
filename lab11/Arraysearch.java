

import java.util.*;

public class Arraysearch{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(101);
        
        int [] array1= new int[50];
        int [] array2= new int[50];
        
        for (int i=0; i<50; i++){
            array1[i]= randomInt;
        }
        
         int max = 0;
    for (int j=1; j<array1.length; j++){
    if (array1[j] > max){
      max=j;
    }
    }
   System.out.println("The maximum number of array1 is: "+ max);
    
    int min=100;
     for (int z=0; z<array1.length; z++){
    if (array1[z] < min){
      min=z;
    }
    }
    System.out.println("The minimum number of array1 is: "+ min);
    
  
    randomInt1= randomInt + 3000;
    
    for(int m=0; m<50; m++ ){
        array2[i]= randomInt1;
        }
    array2[1]=randomInt;
    
    int max=0;
    for (int n=1; n<array2.length; n++){
    if (array2[n] > max){
      max=n;
    }
    }
    System.out.println("The maximum number of array2 is: "+ max);
    
    for (int k=1; k<array2.length; k++){
    if (array2[k] > array2[max]){
      max=k;
    }
    }
    System.out.println("The minimum number of array2 is: "+ min);
    
    }
}`