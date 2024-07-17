class Solution {
    public void noOfSubsets(int[] nums,List<Integer>list,int i,List<List<Integer>>result){
      if(i>=nums.length){
       result.add(new ArrayList<>(list));
       return;
      } 
      list.add(nums[i]);
      noOfSubsets(nums,list,i+1,result); 
      list.remove(list.size()-1);
      noOfSubsets(nums,list,i+1,result); 
    }
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> result= new ArrayList<>(); 
       noOfSubsets(nums,new ArrayList<>(),0,result);
       return result;
    }
}