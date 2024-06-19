class TribonnaciSolution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        
        int[] tribArray = new int[n+1];
        tribArray[0] = 0;
        tribArray[1] = 1;
        tribArray[2] = 1;
        for(int i=3 ;i<=n;i++){

            tribArray[i] = tribArray[i-1] + tribArray[i-2] +tribArray[i-3] ;
        }
        return tribArray[n];
        

        
    }
}
