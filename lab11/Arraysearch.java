

import java.util.*;

public class Arraysearch{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(100);
       int randomInt1=0;
        
        int [] array1= new int[50];
        int [] array2= new int[50];
        
        for (int i=0; i<50; i++){
            randomInt = randomGenerator.nextInt(100);
            array1[i]= randomInt;
        }
        
         
    int max = 0;
   
    for (int j=0; j<array1.length; j++){
    if (array1[j] > max){
      max=array1[j];
    }
    }
   System.out.println("The maximum number of array1 is: "+ max);
    
    int min=200;
     for (int z=0; z<array1.length; z++){
    if (array1[z] < min){
      min=array1[z];
    }
    }
    System.out.println("The minimum number of array1 is: "+min);
    
  
    
    
    for(int m=0; m<50; m++ ){
        randomInt = randomGenerator.nextInt(100);
        randomInt1= randomInt + 1000;
        array2[m]= randomInt1;
        }
    array2[0]=randomInt;
    
    
    for (int i=1; i<array2.length; i++){
    if (array2[i] > max){
      max=array2[i];
    }
    }
   System.out.println("The maximum number of array2 is: "+ max);
    
    min=30000;
     for (int n=0; n<array2.length; n++){
    if (array2[n] < min){
      min=array2[n];
    }
    }
    System.out.println("The minimum number of array1 is: "+ min);
    
    System.out.println("Enter an int: ");
    int x= scan.nextInt();
    
    while(x<0){
        System.out.println("Please input an integer that is greater than 0: ");
        x= scan.nextInt();
    }
    int low = 0;
    int high=array2.length-1;
    int mid=0;
    
    while(high >=low){
        mid=(low+high)/2;
        if(x<array2[mid]){
            high=mid-1;
        }
        else if(x== array2[mid]){
            System.out.println("The number was found in the list.");
        }
        else{
            low=mid+1;
        }
    
    }
    System.out.println("The number was not found. ");
    System.out.println("The number above the key is "+array2[mid-1]);
    System.out.println("The number above the key is "+array2[mid+1]);
    
    
    
}
}