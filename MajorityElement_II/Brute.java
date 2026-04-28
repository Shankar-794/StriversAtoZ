import java.util.*;
class BruteSolution{
    public List<Integer> majorityEleII(int[] nums){
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(res.size()==0 || res.get(0)!=nums[i]  && (res.size() < 2 || res.get(1) != nums[i])){
                int cnt = 0;
                for(int j=0;j<n;j++){
                    if(nums[j]==nums[i]) cnt++;
                }
                if(cnt>Math.floor(n/3)){
                    res.add(nums[i]);
                }
            }
        }
        return res;
    }
}
public class Brute {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] nums = {1,1,1,3,3,2,2,2};
        List<Integer> res = sol.majorityEleII(nums);
        System.out.println(res);
    }
}
