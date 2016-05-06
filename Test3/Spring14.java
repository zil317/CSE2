

import java.util.*; 

public class Spring14{  // main method provided
  public static void main(String [] arg){
 
     
 /*     String y[]=new String[2];
      String x[]= {"one", "two", "to", "fifteen", "three"};
      int min = 1000;
      int max = 0;
      
      for(int i=0; i<x.length; i++){
          if (x[i].length() < min){
              
              min = x[i].length();
              y[0]=x[i];
          }
          
      }
      
      for(int j=0; j<x.length; j++){
          if(x[j].length()>max){
              
              max=x[j].length();
              y[1]=x[j];
          }
          
      }

      
      for(int k=0; k<y.length; k++){
          System.out.println(y[k]);
      }
      
}
      
      
       String x[]= {"one", "two", "to", "fifteen", "three"};
        String y[]=new String[2];
        y[0]=x[0];
        y[1]=x[0];
        for(int j=1;j<x.length;j++){
            if(y[0].length()>x[j].length()){
               y[0]=x[j];
            }
            if(y[1].length()<x[j].length()){
                y[1]=x[j];
            }
        }
       System.out.println(Arrays.toString(minMax));
    }

*/



        int x[]= {3, 12, 15, 6, 0, 0, 0, 0, 0};
        if(x[0]>x.length-1){
            System.out.println("Error, x[0] exceeds x.length-1");
        }
        else {
            System.out.print("{");
            for(int j=1;j<x[0]+1;j++){
                if(j>1){
                    System.out.print(", ");
                }
                System.out.print(x[j]);
            }
            System.out.println("}");

        }
    }


  }
