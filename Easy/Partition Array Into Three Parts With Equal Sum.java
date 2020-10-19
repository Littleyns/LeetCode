class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        boolean res = false ;
           int sum = 0;
        int count = 0;
        
        int k = 1;
        int t = 0;
        boolean continu = true;
        for(int i =0;i<A.length;i++){
            sum =sum+A[i];
        }
        if(sum%3!=0){
            res= false;
        }
        for(int j= 0;j<A.length;j++){
            
            count = count+A[j];
            
            
            if(count==k*(sum/3)){
                t++;
                k++;
                 
            }
            
           
            
        }
        
        if(t>=3){
            res = true;
        }
        return res;
    }
}