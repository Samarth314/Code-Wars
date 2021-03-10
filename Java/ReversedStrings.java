public class Kata {

    public static String solution(String str) {
      // Your code here...
      
      String result = "";
      
      for(int i=str.length()-1; i>-1; i--){
        
        result = result + str.charAt(i);
        
      }
      
      
      return result;
    }
  
  }