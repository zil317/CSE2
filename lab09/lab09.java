
import java.util.*;
public class lab09{
    //main method required for the every Java prgram 
  
        
        public static String Mymethod1(){
            
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);    

        String Adjectives= "";
        switch(randomInt){
            case 0: Adjectives = "beautiful";
            break;
            case 1: Adjectives = "pretty";
            break;
            case 2: Adjectives = "high";
            break;
            case 3: Adjectives = "low";
            break;
            case 4: Adjectives = "thin";
            break;
            case 5: Adjectives = "big";
            break;
            case 6: Adjectives = "small";
            break;
            case 7: Adjectives = "important";
            break;
            case 8: Adjectives = "young";
            break;
            case 9: Adjectives = "old";
            break;
        
        }
        return Adjectives;
        }
        
        
        public static String Mymethod2(){
            Random randomGenerator = new Random();
           int randomInt = randomGenerator.nextInt(10);
             String Nouns= "";
        switch(randomInt){
            case 0: Nouns = "dog";
            break;
            case 1: Nouns = "cat";
            break;
            case 2: Nouns = "dolphin";
            break;
            case 3: Nouns = "sheep";
            break;
            case 4: Nouns = "kitty";
            break;
            case 5: Nouns = "bottle";
            break;
            case 6: Nouns = "socks";
            break;
            case 7: Nouns = "pants";
            break;
            case 8: Nouns = "pen";
            break;
            case 9: Nouns = "pencil";
            break;
        }
        return Nouns;
        }
        
        public static String Mymethod3(){
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(10);
             String Verbs= "";
        switch(randomInt){
            case 0: Verbs = "went";
            break;
            case 1: Verbs = "bought";
            break;
            case 2: Verbs = "brought";
            break;
            case 3: Verbs = "ran";
            break;
            case 4: Verbs = "jumped";
            break;
            case 5: Verbs = "slept";
            break;
            case 6: Verbs = "sobbed";
            break;
            case 7: Verbs = "asked";
            break;
            case 8: Verbs = "learned";
            break;
            case 9: Verbs = "watched";
            break;
        }
        return Verbs;
        }
        
        public static String Mymethod4(){
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(10);
             String object= "";
        switch(randomInt){
            case 0: object = "cat";
            break;
            case 1: object = "sheep";
            break;
            case 2: object = "flower";
            break;
            case 3: object = "water";
            break;
            case 4: object = "phone";
            break;
            case 5: object = "wallet";
            break;
            case 6: object = "computer";
            break;
            case 7: object = "mouse";
            break;
            case 8: object = "backpack";
            break;
            case 9: object = "pants";
            break;
        }
        return object;
        }
        
        
          public static void main(String[] args){
              Scanner scan=new Scanner(System.in);
              String x="";
             String Adjectives1 = Mymethod1();
             String Adjectives2 = Mymethod1();
             String Nouns = Mymethod2();
             String Verbs = Mymethod3();
             String object = Mymethod4();
             System.out.println("The" + " " + Adjectives1 + " " + Nouns +" " + Verbs +" " +"the"+ " " + Adjectives2 + " " + object);
              boolean incorrectinput = true;
              
              System.out.println("Would you want another sentence? ");
              x= scan.next();
    
              while (incorrectinput){
                  
                  Adjectives1 = Mymethod1();
                  Adjectives2 = Mymethod1();
                  Nouns = Mymethod2();
                  Verbs = Mymethod3();
                  object = Mymethod4();
                  if(x.equals("y")){
                      System.out.println("The" + " " + Adjectives1 + " " + Nouns +" " + Verbs +" " +"the"+ " " + Adjectives2 + " " + object);
                      System.out.println("Would you want another sentence? ");
                      x= scan.next();
                  }
                  else{
                      incorrectinput=false;
                  }
              }
        
        
        }
}
