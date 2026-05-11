import java.util.*;
class BruteSolution{
    public List<List<Integer>> mergeOverlapping(int[][] arr){
        Arrays.sort(arr, (a,b)-> a[0]-b[0]);
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        int i=0;
        while(i<n){
            int start = arr[i][0];
            int end = arr[i][1];
            int j = i+1;
            while(j<n && arr[j][0]<=end){
                end = Math.max(end,arr[j][1]);
                j++;
            }
            res.add(Arrays.asList(start,end));
            i=j;
        }
        return res;
    }
}
public class BruteForce {
    public static void main(String[] args) {
        BruteSolution sol = new BruteSolution();
    int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
    List<List<Integer>> res = sol.mergeOverlapping(arr);
    for(List<Integer> interval:res){
        System.out.println(interval);
    }
    }

}
