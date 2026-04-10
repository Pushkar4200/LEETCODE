class Solution {
    public int minBitFlips(int start, int goal) {
        int op=start^goal;
        int c=0;
        for(int i=0;i<31;i++){
            if(((op>>i)&1)==1){
               c++;
            }
        }
        return c;
    }
}