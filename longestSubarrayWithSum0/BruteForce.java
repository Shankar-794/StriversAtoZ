package longestSubarrayWithSum0;
class BruteSolution{
    public int longestSubarray(int[] arr){
        int n = arr.length;
        int maxLength = 0;
        for(int start = 0;start<n;start++){
            int sum = 0;
            for(int end=0;end<n;end++){
                sum+=arr[end];
                if(sum==0){
                    maxLength = Math.max(maxLength,end-start+1);
                }
            }
        }
        return maxLength;
    }
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {1, -1, 3, 2, -2};
        int longestLength = sol.longestSubarray(arr);
        System.out.println("The longest subarray length with sum 0 is: " + longestLength);
    }
}
