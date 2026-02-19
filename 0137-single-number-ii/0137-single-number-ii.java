class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> op=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!op.containsKey(nums[i])){
                op.put(nums[i],1);
            }
            else{
                op.put(nums[i],op.get(nums[i])+1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if((op.get(nums[i]))==1){
               return nums[i];
            }
        }
        return 1;
    }
}