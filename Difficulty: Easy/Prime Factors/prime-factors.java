//{ Driver Code Starts


import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.AllPrimeFactors(N);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends




class Solution
{
         
    public int[] AllPrimeFactors(int n)
    { ArrayList<Integer> primeFactors = new ArrayList<>();

        
        for (int i = 2; i <= n; i++) {
            
            if (n % i == 0) {
                
                primeFactors.add(i);
            }
            
            while (n % i == 0) {
                n = n / i;
            }
        }
    
    int[] result = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            result[i] = primeFactors.get(i);
        }

        return result;

    }
}