public class ReverseWords{

    public static String reverseWords(String str){
        //write your code here...
      String[] originalArray = str.split(" ");
      
      String result = "";
      
      int checker = -1;
      
      for(int i=(originalArray.length-1); i>-1; i--){
         
        if(checker == -1){
          
          result = result + originalArray[i];
          checker = 1;
        }else{
          
          result = result + " " + originalArray[i];
          
        }
        
      }
      
      return result;
    }
   }