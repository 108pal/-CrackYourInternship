class Solution {
    public int [] twoSum(int[] nums, int target) {
       int []result= new int[2];
       Map<Integer,Integer> map=new HashMap<>();

       for(int i=0;i<nums.length;i++){
        int compliment=target-nums[i];
        while(map.containsKey(compliment)){
            result[0]=map.get(compliment);
            result[1]=i;
            break;
        }
        map.put(nums[i],i);
       }
       return result;
    }
}