import java.util.*;
class OptimalSolution{
    public List<List<Integer>> mergeOverlap(int[][] arr){
        int n = arr.length;
        Arrays.sort(arr, (a,b)->a[0]-b[0]);
        List<List<Integer>> res = new ArrayList<>();
        for(int[] interval : arr){
            if(res.isEmpty() || res.get(res.size()-1).get(1)<interval[0]){
                res.add(Arrays.asList(interval[0],interval[1]));
            }
            else{
                int last = res.size()-1;
                int maxEnd = Math.max(res.get(last).get(1),interval[1]);
                res.get(last).set(1,maxEnd);
            }
        }
        return res;

    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> res = sol.mergeOverlap(arr);
        for(List<Integer> interval:res){
            System.out.println(interval);
        }
    }
}


