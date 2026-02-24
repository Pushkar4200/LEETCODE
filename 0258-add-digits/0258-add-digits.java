class Solution {
    public int addDigits(int n) {
        if(n<=9 && n>=0) return n;
        int op=0;
        while(n>0){
            op+=n%10;
            n=n/10;
        }
        return addDigits(op);
    }
}