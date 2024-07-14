class Solution {
    public int eraseOverlapIntervals(int[][] interval) {
        int ans = 0;
        Arrays.sort(interval, (a,b) -> a[1]-b[1]);
        int prev = interval[0][1];
        for(int i = 1; i<interval.length; i++){
            if(prev > interval[i][0])
                ans++;
            else
                prev = interval[i][1];
        }
        return ans;
    }
}