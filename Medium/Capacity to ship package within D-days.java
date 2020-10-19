class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int min = 0 ;
        int max = 0 ;
        int res = 0;
        for(int i = 0 ; i<weights.length;i++){
            max = max+weights[i];
            min = Math.max(min,weights[i]);
        }
        for(int i = min ; i<=max;i++){
            if(numberOfDaysNeededWithThisCapacity(i,weights)==D){
                res = i ;
                break;
            }
            
        }
        
        
        return res;
        
    }
   public int numberOfDaysNeededWithThisCapacity(int Capacity,int[] weights){
       int daysRequired = 1 ;
       int current = 0 ;
       for(int i = 0 ; i<weights.length;i++){
           current = current + weights[i];
           if(current>Capacity){
               daysRequired++;
               current=  weights[i] ;
           }
           
           
       }
       return daysRequired;
   }
       
       
   
}
