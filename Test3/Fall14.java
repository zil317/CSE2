




import java.util.*; 

public class Fall14{  // main method provided
  public static void main(String [] arg){
      int x[]= {1,2,4,3,4,5,2,3};
      int count=0;
      boolean incorrectinput = false;
      for(int i=0; i<x.length; i++){
          for(int j=0; j<i; j++){
              if (x[j]==x[i]){
                  count++;
                  
          }
          }
      }
      System.out.println(count);
      int [] y= new int [x.length-count];
      
      for(int k=0; k<y.length; k++){
          for(int m=0; m<k; m++){
              if (x[k]!=x[m]){
                  y[m]=x[m];
                  
          }
         
          }
           
      }
      
      
      System.out.println(Arrays.toString(y));
  }
}