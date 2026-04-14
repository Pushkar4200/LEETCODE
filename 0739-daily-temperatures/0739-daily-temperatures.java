class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] mn=new int[n];
        Stack<Integer> op=new Stack<>();
        op.push(0);
        for(int i=0;i<n;i++){
            while(!op.isEmpty() && temperatures[op.peek()]<temperatures[i]){
                int bb=op.pop();
                mn[bb]=i-bb;
            }
            op.push(i);
        }
        return mn;
    }
}