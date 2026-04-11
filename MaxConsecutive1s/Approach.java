package MaxConsecutive1s;
class Solution{
    public int maxStreak(int[] arr){
        int count = 0;
        int maxs = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count = 0;
                continue;
            }
            count++;
            maxs = Math.max(maxs,count);
        }
        return maxs;
    }
}
public class Approach {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1,1,0,1,1,1,};
        int maxs = sol.maxStreak(arr);
        System.out.println("The maximum consecutive 1s is: " + maxs);
    }
}
