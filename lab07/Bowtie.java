

import java.util.*; 

public class Bowtie{
    //main method required for the every Java prgram 
    public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
        
        int nStars = 9;
        int i;
        int j=0;
        int k,m,n;
        int avg= (nStars+1)/2;
       
        
 while (j < nStars){
     i=0; k=0;m=0;n=0;
    if(j < avg){
     while(i<=j-1){
         System.out.print(" ");
         i++;
     }
     while(k < nStars-2*j){
         System.out.print("*");
         k++;
     }
    }
   else{  
     
   while(n < nStars-j-1){
         System.out.print(" ");
         n++;
     }
    
     
     while(m < ((j-avg+1)*2+1)){
         System.out.print("*");
         m++;
     }
   }
    
    System.out.println("");
     
     j++;
   

 }
 
 System.out.println("Please input an odd integer between 3 and 33: ");
 nStars= scan.nextInt();
 while(nStars<3||nStars>33){
  System.out.println("Please input another integer: ");
  nStars=scan.nextInt();
 }

while(nStars%2==0){
 System.out.println("Please input another integer: ");
 nStars= scan.nextInt();
}


avg= (nStars+1)/2;
 
 
 j=0;
 
 do{
  i=0; k=0; n=0; m=0;
  if(j==0||j==nStars-1){
   do{
   System.out.print("*");
   i++;
  }while(i<nStars);
  }
  
  else{
  if(j<avg){
   do{
    
    System.out.print(" ");
    i++;
   }while(i<=j-1);
   
   do{
    System.out.print("*");
    k++;
   }while(k < nStars-2*j);
   
   }
 else{
    do{
     System.out.print(" ");
     n++;
    }while(n < nStars-j-1);
   
   do{
    System.out.print("*");
    m++;
   
   }while(m < ((j-avg+1)*2+1));
   }
  }
   j++;
   System.out.println("");
  }while(j < nStars);
 
 
 
 System.out.println("Please input an odd integer between 3 and 33: ");
 nStars= scan.nextInt();
 while(nStars<3||nStars>33){
  System.out.println("Please input another integer: ");
  nStars=scan.nextInt();
 }

while(nStars%2==0){
 System.out.println("Please input another integer: ");
 nStars= scan.nextInt();
}


avg= (nStars+1)/2;
j=0;


for(j=0; j<nStars; j++){
 
 if(j < avg){
  for(i=0; i<=j-1; i++){
   System.out.print(" ");
  }
  for(k=0; k<nStars-2*j; k++){
    System.out.print("*");
  }
 }
 else{
  for(n=0; n< nStars-j-1;n++){
   System.out.print(" ");
  }
  for(m=0; m < ((j-avg+1)*2+1); m++){
   System.out.print("*");
  }
 }
 
  System.out.println("");
 
 
 
}


       



 
    }
 }
        
    