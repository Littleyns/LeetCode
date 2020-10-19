class Solution {
    public int fib(int N) {
      int fib[] = new int[N+1];
        fib[0]=0;
        if(N>=1){
            fib[1]=1;
        }
        
        if(N>=2){
            for(int i = 2 ; i<N+1;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
            
        }
        return fib[N];
    }
}