import java.util.Stack;
class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> op=new Stack<>();
        for(int i=0;i<arr.length;i++){
            String ch=arr[i];
            if(ch.equals("C")){
                op.pop();
            }
            else if(ch.equals("D")){
                op.push(2*(op.peek()));
            }
            else if(ch.equals("+")){
                int a=op.pop();
                int b=a+op.peek();
                op.push(a);
                op.push(b);
            }
            else{
                op.push(Integer.parseInt(ch));
            }
        }
        int hy=0;
        while(!op.isEmpty()){
            hy+=op.pop();
        }
        return hy;
    }
}