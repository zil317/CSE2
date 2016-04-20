//Zihan Liu
//CSE2 HW12
//The assignment is to write the following methods: randomInput(), delete(list,pos), and remove(list,target)

import java.util.*; 

public class RemoveElements{  // main method provided
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=" ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }


    
    
    
   
   
    public static int[] randomInput(){  
        
        Random randomGenerator = new Random();
        
      int input[]=new int[10];
       for(int i=0;i<10;i++){
         int randomInt = randomGenerator.nextInt(10);  //generate a random number 
         input[i]=(int) randomInt; //fill the random number in the array 
       }
       return input;
    }
    
    public static int[] delete(int[] list,int pos){
        int [] array1 = new int[list.length-1]; //create a new array 
        
        if(pos<0||pos>list.length-1){
            System.out.println("The index is not valid. "); // if the input position is out of range, print out error message
            return list;
        }
        
        for(int i=0; i<pos; i++){
            array1[i] = list[i]; //Before the position in the array, keep all the elements 
        }
        for(int i=pos; i<list.length-1; i++){
            array1[i] = list[i+1]; // skip the number of at the position in the array 
        }
        System.out.println("Index "+array1[pos]+" has been removed.");
        return array1;
    }
    
    public static int[] remove(int[] list, int target){
        boolean input= false;
        int j=0, m=0;
        
        for(int i=0; i<list.length; i++){ //find how many times that the numbers in the array equal to the target value
            if(list[i]==target){
            j++;
          }
        }
        
            
        
        int [] array2 = new int[list.length-j]; //create a new array 
        
        
        
        for(int k=0; k<list.length; k++){
            if(list[k]==target){
                continue; //skip the position that the number in the original array equals to the target value
            }
            else{
                array2[m]= list[k]; // keep all other numbers in the original array 
                m++;
            }
            
        
        }
        
        return array2;
    }
    
}