package longestSubarrayWithSumK;
class OptimalSolution{
    public int lonngestSubarray(int[] arr, int k){
        int n = arr.length;
        int maxLnegth = 0;
        int sum = 0;
        int left = 0;
        for(int right = 0;right<n;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                int currLength = right-left+1;
                maxLnegth = Math.max(maxLnegth,currLength);
            }
        }
        return maxLnegth;
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int longestLength = sol.lonngestSubarray(arr, k);
        System.out.println("The longest subarray length with sum " + k + " is: " + longestLength);
    }
}
