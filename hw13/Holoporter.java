// Zihan Liu 
//CSE2 HW13
//The purpose of this code is to imitate the Holoportation technology on the molecular level.
//First we generate two random length 3D array and then we holoport a 3D array to another. 
//Next, we perform searching and summing and reordering in the 3D array.


import java.util.*; 

public class Holoporter{  // main method provided
  public static void main(String [] arg){
      Scanner scan=new Scanner(System.in); //create new scanner
      String code="";
      String temp="";
     
     String [][][] newarray = soRandom(); // define a array 
      
    
      
    for (int i=0; i<newarray.length; i++){
        for(int j=0; j<newarray[i].length; j++){
            for (int k=0; k<newarray[i][j].length; k++){

                temp= Coder();
                boolean moveon = false;
                while(!moveon){
                    if(same(temp, newarray)){   //if true, has same molecules 
                        temp= Coder();   
                        moveon= false; //run the while loop again 
                    }
                    else{
                        moveon= true; //if false, no same molecules, exit loop 
                    }
                }
                newarray[i][j][k]=temp;

            }
        }
    }
    
    
    
    
    
    String [][][] anotherarray = soRandom(); //run method soRandom to generate an onject array with random lengths
    print(newarray); //print out the array 
    
    System.out.println("");
    System.out.println("The holoported 3D is the following: ");
    System.out.println("");
    holoport(newarray, anotherarray); //holoport an array to another
    
    System.out.println("");
    System.out.println("Please input a code to a search in the format of XXYYYY: "); //ask user for input 
    code = scan.next();
    
/*    boolean incorrectinput1= true;
    while(incorrectinput1){
        int N= code.length();
        if(N==6){
        incorrectinput1= false; //if there are six characters in the molecule, continue
        }
        else{
            System.out.println("Please input again in the format of XXYYYY: "); //if there are not six characters in the molecule, ask user to input again
            code= scan.next();
        }
    }
    */
    
    
    boolean incorrectinput2 = true;
    while(incorrectinput2){
    
    char a= code.charAt(0);  //break down the user input into six chars
    char b= code.charAt(1); 
    char c= code.charAt(2); 
    char d= code.charAt(3); 
    char e= code.charAt(4); 
    char f= code.charAt(5); 
    
    int g=(int) a;  //convert chars to ints
    int h=(int) b; 
    int i=(int) c; 
    int j=(int) d;
    int k=(int) e; 
    int l=(int) f; 
        //if first two chars are letters and the rest four chars are letter, accept input 
        if(g >64 && g <91 && h >64 && h<91 && i>47 && i<58 && j>47 && j<58 && k>47 && k<58 && l>47 && l<58){
            incorrectinput2= false;
            
        }
        //if not, ask user to input again 
        else{
            System.out.println("Please input again in the format of XXYYYY: ");
            code = scan.next();
        }
    }
    
    sampling(anotherarray, code); //run sampling method
    
    percentage(newarray, anotherarray); //run percentage method
    
    System.out.println("");
    System.out.println("The reordered object is the following: ");
    System.out.println("");
    
    frankenstein(newarray); //run frankenstein method
    

   
         
      
  }
      

      public static String[][][] soRandom() { //generate 3D array of different lengths
      
      Random randomGenerator = new Random();
      int randomx = randomGenerator.nextInt(10)+1; //generate random number
      
      String [][][] array= new String [randomx][][]; 
      
      for(int i=0; i<array.length; i++){
          int randomy = randomGenerator.nextInt(10)+1;
          array[i]= new String [randomy][];
      }
      
      for(int i=0; i<array.length; i++){
          for(int j=0; j<array[i].length;j++){
              int randomz = randomGenerator.nextInt(10)+1;
              array[i][j]=new String [randomz];
          }
      }
      
       
       return array;
       
      }
      
   
      public static String Coder(){  //generate a molecule in the format of XXYYYY
          Random randomGenerator = new Random();
          String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          int N = alphabet.length();
          Random x = new Random();
          Random y = new Random();
          Random i = new Random();
          Random j = new Random();
          Random k = new Random();
          Random m = new Random();
          char a=alphabet.charAt(x.nextInt(N)); // generate a random letter
          char b=alphabet.charAt(y.nextInt(N));
          
          String number ="0123456789";
          int M= number.length();
          
          char c=number.charAt(i.nextInt(M)); //generate a random number 
          char d=number.charAt(j.nextInt(M));
          char e=number.charAt(k.nextInt(M));
          char f=number.charAt(m.nextInt(M));
          
        
          char[] charArrays = new char[] {a,b,c,d,e,f}; //create a new array with chars
          String newString = new String(charArrays);
         // System.out.println(newString);
          
          return newString;
          
      }
      
      public static void print(String [][][] newarray){ // print out an array 
    for (int i=0; i<newarray.length; i++){
        for(int j=0; j<newarray[i].length; j++){
            System.out.print("[");
            for (int k=0; k<newarray[i][j].length; k++){
                if(k==0){
                    System.out.print(newarray[i][j][k]);
                }
                else{
                    System.out.print(","+newarray[i][j][k]); //codes are separated by ","
                }
                
            }
            System.out.print("]");
            if(j!=newarray[newarray.length-1].length-1){
            System.out.print("|"); //the 2nd dimensions are separated by “ | ”
            }
        }
        if(i!=newarray.length-1){
        System.out.print("---");//the outermost dimension is to be separated by “---”
        }
    }
    }
      
      public static String[][][] holoport(String[][][] newarray, String[][][] anotherarray){ //holoport an array to another array 

         
          for(int i=0; i<anotherarray.length; i++){
              if(i < newarray.length){
                  for(int j=0; j<anotherarray[i].length; j++){
                      if(j < newarray[i].length){
                          for(int k=0; k< anotherarray[i][j].length; k++){
                              if(k< newarray[i][j].length ){
                                  anotherarray[i][j][k]= newarray[i][j][k];
                              }
                              else{
                                  anotherarray[i][j][k]="$$$$$$"; //If the inner container is bigger than the object, filled the excess space with special code “$$$$$$”
                              }
                              
                          }
                      }
                      else{
                          for(int k=0; k< anotherarray[i][j].length; k++){
                              anotherarray[i][j][k]="$$$$$$"; //If the 2nd inner container is bigger than the object, filled the excess space with special code “$$$$$$”
                          }
                      }
                  }
              }
              else{
                  for(int j=0; j< anotherarray[i].length; j++ ){
                      for(int k=0; k< anotherarray[i][j].length; k++){
                          anotherarray[i][j][k]="$$$$$$"; //If the outer container is bigger than the object, filled the excess space with special code “$$$$$$”
                      }
                  }
              }
          }
          
          
         print(anotherarray);

         return anotherarray;
          }
          
          
          public static void sampling(String [][][] newarray, String code){// the method takes in a 3D array and a specified code
          boolean incorrectinput= false;
              for(int i=0; i<newarray.length; i++){
                  for(int j=0; j< newarray[i].length; j++){
                      for(int k=0; k< newarray[i][j].length; k++){
                          
                          if (newarray[i][j][k].equals(code)){
                              System.out.println(i+","+j+","+k); // if the code is found in the array, print out index i, i and k
                              incorrectinput=false;
                          }
                          else{
                              incorrectinput = true;  //if the code is not found, print out error message
                          }
                      }
                  }
              }
              if(incorrectinput=true){ 
              System.out.println("Code not found.");
              }
          }
          
          //This function takes in the original object and the holoported object and prints out a percentage that indicates how completely the holoportation is.
          public static void percentage(String [][][] newarray, String[][][] anotherarray){
              int sum1=0, sum2=0; int percent=0;
              for(int i=0; i<newarray.length; i++){
                  for(int j=0; j< newarray[i].length; j++){
                      for(int k=0; k< newarray[i][j].length; k++){
                          sum1++; //count how many molecules in the object 
                          
                      }
                  }
              }
              
              for(int a=0; a<anotherarray.length; a++){
                  for(int b=0; b< anotherarray[a].length; b++){
                      for(int c=0; c< anotherarray[a][b].length; c++){
                          sum2++; // count how many molecules in the container 
                          
                          
                      }
                  }
              }
          
              percent = ((sum2-sum1)*100)/sum1;
              System.out.println("The percent is: "+percent+"%."); //print out the percentage
              
              
          }
          
          //Reorder the elements of each member of each member array in ascending order based on the code.
          //Reorder the second dimension of the 3D array in ascending order based on the length of each array.
          public static void frankenstein(String[][][] newarray){
              
              String str=""; String STR="";
              for(int i=0; i<newarray.length; i++){
                  for(int r=0; r<i; r++){
                  for(int j=0; j< newarray[i].length; j++){
                      for(int n=0; n<j; n++){
                      for(int k=0; k< newarray[i][j].length; k++){
                          for(int m=0; m< k; m++){
                              
                          str = newarray[i][j][k];
                          char a=str.charAt(0); int g=(int) a; //break down a string into chars and convert them into integer
                          char b=str.charAt(1); int h=(int) b;
                          char c=str.charAt(2); int o=(int) c;
                          char d=str.charAt(3); int p=(int) d;
                          char e=str.charAt(4); int q=(int) e;
                          char f=str.charAt(5); int l=(int) f; 
                          
                          STR = newarray[i][j][m];
                          char A=STR.charAt(0); int G=(int) A;//break down a string into chars and convert them into integer
                          char B=STR.charAt(1); int H=(int) B;
                          char C=STR.charAt(2); int O=(int) C;
                          char D=STR.charAt(3); int P=(int) D;
                          char E=STR.charAt(4); int Q=(int) E;
                          char F=STR.charAt(5); int L=(int) F;
                          
                          if(g<G){ //compare the first letter in the string 
                              String temp= newarray[i][j][k];
                              newarray[i][j][k]=newarray[i][j][m];
                              newarray[i][j][m]= temp; 
                          }
                          else if(g==G){ //compare the second letter in the string
                              if(h<H){
                                String temp= newarray[i][j][k];
                                newarray[i][j][k]=newarray[i][j][m];
                                newarray[i][j][m]= temp;
                              }
                              else if(h==H){ //compare the first number in the string 
                                  if(o<O){
                                    String temp= newarray[i][j][k];
                                    newarray[i][j][k]=newarray[i][j][m];
                                    newarray[i][j][m]= temp;
                                  }
                                  else if(o==O){ //compare the second number in the string 
                                      if(p<P){
                                        String temp= newarray[i][j][k];
                                        newarray[i][j][k]=newarray[i][j][m];
                                        newarray[i][j][m]= temp;
                                      }
                                      else if(p==P){ //compare the third number in the string 
                                          if(q<Q){
                                            String temp= newarray[i][j][k];
                                            newarray[i][j][k]=newarray[i][j][m];
                                            newarray[i][j][m]= temp;
                                          }
                                          else if(q==Q){ //compare the last number in the string 
                                              if(l<L){
                                                String temp= newarray[i][j][k];
                                                newarray[i][j][k]=newarray[i][j][m];
                                                newarray[i][j][m]= temp;
                                              }
                                          }
                                      }
                                  }
                              }
                          }
                          
                          }
                          
                      }
                      
                    if(newarray[i][j].length< newarray[i][n].length){ //compare and reorder the inner array  
                        String[] swap= newarray[i][j];
                        newarray[i][j]= newarray[i][n];
                        newarray[i][n]=swap;
                    }
                    
                      }
                      
                      
                      
                      
                  }
                  
                  if(newarray[i].length< newarray[r].length){ //compare and recorder the second dimension of the 3D arrray 
                     String[][] outer= newarray[i];
                     newarray[i]= newarray[r];
                     newarray[r]=outer;
                  }
                  }
                  
                  
                  
              }
              print(newarray);
              
              
              
              
              
          }
          
         
         public static boolean same(String temp, String[][][] newarray){  // test if the generated array has two same molecules
         for (int i=0; i<newarray.length; i++){
            for(int j=0; j<newarray[i].length; j++){
                for (int k=0; k<newarray[i][j].length; k++){
                    if(temp.equals(newarray[i][j][k])){
                        return true; // if code generated is the same with one of the molecules in the array return true
                    }
                }
            }
         }
                    return false; //if not return false
         }
                
          
     }
     
     
     