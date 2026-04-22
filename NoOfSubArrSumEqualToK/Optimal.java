import java.util.HashMap;

class OptimalSolution{
    public int subArrCount(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;
        int presum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            presum+=arr[i];
            int remove = presum-k;
            cnt+=map.get(remove);
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}
public class Optimal {
    public static void main(String[] args) {
        BetterSolution sol = new BetterSolution();
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int res = sol.subArrCount(arr, 3);
        System.out.println(res);
    }
}
