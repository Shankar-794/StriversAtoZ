package longestSubarrayWithSumK;
class BruteSolution{
    public int longestSubarray(int[] arr, int k){
        int n = arr.length;
        int maxLnegth = 0;
        for(int startIndex = 0;startIndex<n;startIndex++){
            for(int endIndex = startIndex;endIndex<n;endIndex++){
                int currSum = 0;
                for(int i=startIndex;i<=endIndex;i++){
                    currSum+=arr[i];
                }
                if(currSum==k){
                    int currLength = endIndex-startIndex+1;
                    maxLnegth = Math.max(maxLnegth,currLength);
                }
            }
        }
        return maxLnegth;
    }   
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int longestLength = sol.longestSubarray(arr, k);
        System.out.println("The longest subarray length with sum " + k + " is: " + longestLength);
    }
}
