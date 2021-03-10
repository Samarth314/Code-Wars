public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
      //your code here !!
      
      int volume1 = 1;
      
      for(int i=0; i<firstCuboid.length; i++){
        
        volume1 = volume1 * firstCuboid[i];
        
      }
      
      int volume2 = 1;
      
      for(int j=0; j<secondCuboid.length; j++){
        
        volume2 = volume2 * secondCuboid[j];
        
      }
      
      if(volume1 >= volume2){
        
        return volume1 - volume2;
        
      } else{
        
        return volume2 - volume1;
        
      }
      
    }
  }