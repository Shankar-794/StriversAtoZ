import java.util.*;
class OptimalSolution{
    public int cntSubArr(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int cnt = 0;
        int prefixXor = 0;
        for(int i=0;i<n;i++){
             prefixXor^= arr[i];
            int x = prefixXor^k;
            if(map.containsKey(x)){
                cnt+=map.get(x);
            }
            map.put(prefixXor,map.getOrDefault(prefixXor, 0)+1);
            
        }
        return cnt;
    }
}
public class Optimal {
    public static void main(String[] args) {
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(sol.cntSubArr(arr, k));
    }
}
