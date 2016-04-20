

import java.util.*;

public class Array{
    //main method required for the every Java prgram 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 
        
        Random randomGenerator = new Random();
       int randomInt = randomGenerator.nextInt(6)+5; 
        
        
        
        int i=0; 
        
        String [] student = new String[randomInt];
        
        System.out.println("Enter"+randomInt+"students name: ");
        for(i=0; i<randomInt; i++){
            
            student[i]=scan.next();
            
        }
        System.out.println("Here are the midterm grades of the"+ randomInt+ "students above:");
       for(int j=0; j<randomInt; j++){
           int randomGrade = randomGenerator.nextInt(101);
            System.out.println(student[j]+"  "+randomGrade);
            
        }
    }
}
            