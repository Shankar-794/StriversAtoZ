import java.util.HashMap;
class BetterSolution{
    public int majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>(n/2)){
                return key;
            }
        }
        return -1;
    }
}
public class Better {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        BetterSolution sol = new BetterSolution();
        System.out.println(sol.majorityElement(arr));
    }
}

