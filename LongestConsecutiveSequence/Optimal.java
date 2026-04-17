import java.util.HashSet;
class OptimalSolution{
    public int longestConsecutive(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        HashSet<Integer> set  = new HashSet<>();
        int maxLen = 1;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int key: set){
            if(!set.contains(key-1)){
                int cnt = 1;
                int x = key;
                while(set.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                maxLen = Math.max(maxLen,cnt);
            }
        }
        return maxLen;
    }
}


public class Optimal {
    public static void main(String[] args){
        OptimalSolution  sol = new OptimalSolution();
        int[] arr = {100, 4, 200, 1, 3, 2};
        int res = sol.longestConsecutive(arr);
        System.out.println(res);
    }
}
