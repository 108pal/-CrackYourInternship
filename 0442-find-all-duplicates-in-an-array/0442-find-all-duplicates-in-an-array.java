class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       boolean[] visited =new boolean[nums.length+1];
       List<Integer> list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(visited[nums[i]]) list.add(nums[i]);
            else visited[nums[i]]=true;
        }
        return list;
    }
}