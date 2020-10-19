class Solution {
    public int[] sortByBits(int[] arr) {
        
        int[] tab = new int[arr.length];
         for(int i =0; i<arr.length;i++){
             tab[i]=0;
         }
        for(int i =0; i<arr.length;i++){
            String binary = Integer.toBinaryString(arr[i]);
            for(int j = 0 ; j<binary.length();j++){
                if(binary.charAt(j)=='1'){
                    tab[i]++;
                }
                
                
            }
            
        }
        for(int i = 0 ; i<arr.length;i++){
            for(int j =0 ;j<arr.length;j++){
                if(tab[i]<tab[j]){
                    int a = tab[j];
                    int b = arr[j];
                    tab[j]=tab[i];
                    tab[i]=a;
                    arr[j]=arr[i];
                    arr[i]=b;
                    
                }else if(tab[i]==tab[j]){
                    if(arr[i]<arr[j]){
                        int c = tab[j];
                    int t = arr[j];
                    tab[j]=tab[i];
                    tab[i]=c;
                    arr[j]=arr[i];
                    arr[i]=t;
                    }
                    
                }
                
            }
            
        }
        return arr ;
    }
}