import java.util.Arrays;
class BetterSolution{
    public int longestConsecutive(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        int maxLen = 1;
        int lastSmaller = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastSmaller){
                count++;
                lastSmaller = arr[i];
            }else if(arr[i]!=lastSmaller){
                count = 1;
                lastSmaller = arr[i];
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
public class Better {
    public static void main(String[] args){
        BetterSolution  sol = new BetterSolution();
        int[] arr = {100, 4, 200, 1, 3, 2};
        int res = sol.longestConsecutive(arr);
        System.out.println(res);
    }
}
