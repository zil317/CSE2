



public class Bowtie{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        
        int nStars = 9;
        int i;
        int j=0;
        int k;
       
        
 while (j< nStars){
     i=0;
      
      while (i< nStars-2*j){
          k=0;
         
          while (k<j){
              System.out.println(" ");
          }
          System.out.println("*");
              
          }
         // System.out.println("Test i"+i);
        //  System.out.println("Test j"+j);
          //if(i<j){
          //System.out.print(" ");
        //  }
    
          //else{
           // System.out.print("*");
          //}
            i++;
        }
     
        System.out.println();
        j++;
 }
        
    
 }
        
    