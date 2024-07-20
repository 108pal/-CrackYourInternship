class Solution {
    public static int countPartition(int []nums, int maxSum ){
        int n=nums.length;
        int sum=0;
        int partition=1;
        for(int i=0;i<n;i++){
            if(sum+nums[i]<=maxSum){
                sum+=nums[i];
            }else{
                partition++;
                sum=nums[i];
            }
        }
        return partition;
    }
    public int splitArray(int[] nums, int k) {
     int low=Integer.MIN_VALUE,high=0;
     for(int i=0;i<nums.length;i++){
         low=Math.max(low,nums[i]);
         high+=nums[i];
     }

     while(low<=high){
         int mid=(low+high)/2;
         int partitions= countPartition(nums,mid);
         if(partitions>k){
             low=mid+1;
         }else{
             high=mid-1;
         }
     }
        return low;
    }
}