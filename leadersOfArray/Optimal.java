package leadersOfArray;
import java.util.*;
class OptimalSolution{
    public ArrayList<Integer> leaders(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                res.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
}
public class Optimal {
    public static void main(String[] args) {
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {4,7,1,0};
        ArrayList<Integer> res = sol.leaders(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
