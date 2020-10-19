class Solution {
    public int singleNonDuplicate(int[] nums) {
      
        
        
       return binarySearching(nums, 0,nums.length-1);
    }
         public int binarySearching(int[] nums, int p,int q){
             
        
        if(p==q){
            return nums[p];
        }
            int mid = p+(q-p)/2;
             int right, left ;
     if(nums[mid+1]==nums[mid]){
         left = mid;
         right = mid+1;
     }else if(nums[mid-1]==nums[mid]){
         left =mid-1;
         right = mid;
     }else{
         return nums[mid];
     } 
        if((q-(right))%2!=0){
            p =right+1;
            
        }
        if(((left)-p)%2!=0){
            q=left-1;
            
        }
        
        return binarySearching(nums ,p,q);
        }   
    
}