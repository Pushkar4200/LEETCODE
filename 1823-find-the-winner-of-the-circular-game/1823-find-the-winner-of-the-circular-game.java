class Solution {
    public int findTheWinner(int n, int k) {
        int c=0;
        Queue<Integer> op=new LinkedList<>();
        for(int i=1;i<=n;i++){
            op.add(i);
        }
        while(op.size()>1){
         for(int i=1;i<k;i++){
            op.add(op.remove());
         }
         op.remove();
        }
        return op.remove();
    }
}