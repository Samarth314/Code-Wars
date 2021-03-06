import java.util.*;

public class Order {
  public static String order(String words) {
    // ...
    //base case
    if(words == ""){
      
      return "";
      
    }

    //any ordinary case
    
    String[] original = words.split(" ");
    String[] organizedArray = new String[original.length];

    for(int s=0; s<original.length; s++){

       organizedArray[s] = "test";
      
    }
    

    for(int j=0; j<original.length; j++){
      System.out.println(original[j]);

      String word1 = original[j];
      
      for(int i=0; i<word1.length(); i++){

        System.out.println(word1.charAt(i));
        
        if(Character.isDigit(word1.charAt(i))){

          System.out.println(word1.charAt(i));
          organizedArray[(Integer.parseInt(Character.toString(word1.charAt(i))))-1] = word1;
        }
      }
    }
    
    String result = "";
    int checker = -1;
    for(String word : organizedArray){
      if(checker == -1){
       result = result + word;
       checker = 1;
      }else{
        result = result + " " + word;    
      }
    }
    return result;
    
  }
}