class Solution {
    public int book(int n){
        int op=0,l=0;
        while(n!=0){
           l=n%10;
           op++;
           n=n/10;
        }
        return op;
    }
    public int findNumbers(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(book(nums[i])%2==0){
               k++;
            }

        }
        return k;
    }
}