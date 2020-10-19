class Solution {
    public int tribonacci(int n) {
        int tab[] = new int[n+1];
        if(n>=3){
        tab[0]=0;
        tab[1]=1;
        tab[2]=1;
        for(int i = 3 ; i<n+1 ;i++){
            tab[i]=tab[i-1]+tab[i-2]+tab[i-3];
        }
        
        }else if(n==2){
            return 1;
        }else if(n==1){
            return 1;
        }else if(n==0){
            return 0;
        }
        return tab[n];
    }
}