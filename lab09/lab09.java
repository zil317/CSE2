
import java.util.Random;
public class lab09{
    //main method required for the every Java prgram 
  
        
        public static String Mymethod1(int randomInt){
            
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(10);    

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
        
        
        public static String Mymethod2(int randomInt){
            randomInt = randomGenerator.nextInt(10);
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
        
        public static String Mymethod3(int randomInt){
            randomInt = randomGenerator.nextInt(10);
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
        
        public static String Mymethod4(int randomInt){
            randomInt = randomGenerator.nextInt(10);
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
              boolean incorrectinput = false;
              while incorrectinput{
                  System.out.print("The"+ Adjectives + Nouns + Verbs + "the" + Adjectives + Nouns)
              }
        
        
        }
}
