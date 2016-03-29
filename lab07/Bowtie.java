



public class Bowtie{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        
        int nStars = 9;
        int i;
        int j=0;
        int k;
       
        
 while (j < nStars){
     i=0; k=0;
     while(i<=j-1){
         System.out.print(" ");
         i++;
     }
     while(k < nStars-2*j){
         System.out.print("*");
         k++;
     }
     System.out.println("");
     j++;
 }
 
    }
        
    
 }
        
    