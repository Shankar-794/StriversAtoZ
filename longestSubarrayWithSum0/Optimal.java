package longestSubarrayWithSum0;
import java.util.HashMap;
class OptimalSolution{
    public int longestSubarray(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen = i+1;
            }
            if(map.containsKey(sum)){
                int prevIndex = map.get(sum);
                int len = i-prevIndex;
                maxLen = Math.max(maxLen,len);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;  
    }
}
public class Optimal {
    public static void main(String[] args) {
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {1, -1, 3, 2, -2};
        int longestLength = sol.longestSubarray(arr);
        System.out.println("The longest subarray length with sum 0 is: " + longestLength);
    }
}
