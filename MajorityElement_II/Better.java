import java.util.*;
class BetterSolution{
    public List<Integer> majorityEleII(int[] nums){
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(freq.get(num)>Math.floor(n/3)){
                res.add(num);
            }
        }
        return res;
    }
}
public class Better {
    public static void main(String[] args){
        BetterSolution sol = new BetterSolution();
        int[] nums = {11, 33, 33, 11, 33, 11};
        List<Integer> res = sol.majorityEleII(nums);
        System.out.println(res);
    }
}
