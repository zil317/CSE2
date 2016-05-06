

import java.util.*; 

public class RaggedArray{  // main method provided
  public static void main(String [] arg){
      int x=0, y=0;
       Random randomGenerator = new Random();
       
       Scanner scan=new Scanner(System.in);
       System.out.println("Please input the size of the column: ");
       x= scan.nextInt();
       
      //ask user for size of array
      int [][] array= new int [x][];
     
     for(int i=0; i<x; i++){
         int randomsize = randomGenerator.nextInt(x-1)+1;
         array[i] = new int [randomsize];
     }
     
     for(int j=0; j<array.length; j++){
         for (int k=0; k<array[j].length; k++){
             int randomInt = randomGenerator.nextInt(20);
             array[j][k]= randomInt;
         }
     }
    
     System.out.println("Here is unsorted array: ");
     for (int i=0; i< array.length; i++){
        for (int j=0; j< array[i].length; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println("");
    }
     
   for (int p=0; p< array.length; p++){
        for(int q=0; q<array[p].length; q++){
            for(int k=0; k<q; k++){
 
            if(array[p][q]<array[p][k]){
                int temp = array[p][q];
                array[p][q]= array[p][k];
                array[p][k]= temp;
                
            }
            }
        }
    } 
    
    System.out.println("Here is the sorted array: ");
    for (int i=0; i< array.length; i++){
        for (int j=0; j< array[i].length; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println("");
    }
    
    
    for (int p=0; p< array.length; p++){
        for(int m=0; m<p; m++){
        for(int q=0; q<array[p].length; q++){
            for(int k=0; k<q; k++){
 
            if(array[p][q]<array[p][k]){
                int temp = array[p][q];
                array[p][q]= array[p][k];
                array[p][k]= temp;
                
            }
            }
        }
        if(array[p].length< array[m].length){
            int[] swap= array[p];
            array[p]= array[m];
            array[m]=swap;
        }
    }
    }
    
    System.out.println("Here is the rearranged array: ");
    for (int i=0; i< array.length; i++){
        for (int j=0; j< array[i].length; j++){
            System.out.print(array[i][j]+" ");
        }
        System.out.println("");
    }
    
   
   
   System.out.println("What number would you like to search for?");
   y= scan.nextInt();
   boolean incorrectinput= true;
   
   for(int n=0; n<array.length; n++){
       for(int m=0; m<array[n].length; m++){
           if(y == array[n][m]){
           System.out.println("Column "+(m+1)+" "+"Row "+(n+1));
           
           }
           else{
               incorrectinput = false;
           }
       
       
       
   }
   }
  
  if(incorrectinput = false){
      System.out.println("Not in the array");
  }
   
  }
}