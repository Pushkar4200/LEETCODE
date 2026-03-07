class Solution {
    public void subsets(int n,int yt,int ty,String g,List<String> op){
        if(ty==n){
            op.add(g);
            return;
        }
        if(yt<n) subsets(n,yt+1,ty,g+"(",op);
        if(ty<yt) subsets(n,yt,ty+1,g+")",op);
    }
    public List<String> generateParenthesis(int n) {
        List<String> op=new ArrayList<>();
        subsets(n,0,0,"",op);
        return op;
    }
}