import static java.lang.Math.toIntExact;

class CodeWars {
  public static long overTheRoad(long address, long n) {
    // Good luck
    int l = toIntExact(n);
    
    int[] oddArray = new int[l];
    int[] evenArray = new int[l];
    
    // Filling in oddArray
    
    for(int i=1; i<=l; i++){
      
      oddArray[i-1] = 1+2*(i-1);
      evenArray[i-1] = 2+2*(i-1);
      
    }

    // Reversing evenArray
    
    int length = evenArray.length;
		for(int i=0;i<length/2;i++) {
			int swap = evenArray[i];
			evenArray[i] = evenArray[length-i-1];
			evenArray[length-i-1] = swap;
	}

    if(address % 2 == 0){

      for(int i=0; i<evenArray.length; i++){
         if(evenArray[i] == address){
           return oddArray[i];
         }
      }
    } else{

      for(int i=0; i<oddArray.length; i++){

        if(oddArray[i]==address){

          return evenArray[i];
          
        }
        
      }
      
    }
    
    
    return 0;
  }
}