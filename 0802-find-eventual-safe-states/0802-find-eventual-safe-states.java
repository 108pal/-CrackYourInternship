class Solution {
    public boolean dfs(int node,int[][]graph, int[] vis,int[] pathVis,int[] check){
        vis[node]=1;
        pathVis[node]=1;
        for(int it : graph[node]){
            if(vis[it]==0){
                if(dfs(it,graph,vis,pathVis,check)==true){
                    check[node]=0;
                    return true;
                }
                
            }else if(pathVis[it]==1){
                check[node]=0;
                return true;
            }
        }
        check[node]=1;
        pathVis[node]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        int[] vis= new int[n];
        int[] pathVis= new int[n];
        int[] check=new int[n];
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                dfs(i,graph,vis,pathVis,check);
            }
        }
        for(int i=0;i<n;i++){
            if(check[i]==1){
                list.add(i);
            }
        }
        return list;
    } 
}