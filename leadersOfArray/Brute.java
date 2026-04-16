package leadersOfArray;
import java.util.*;
class BruteSolution{
    public ArrayList<Integer> leaders(int[] arr){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean isLeader = true;
            for(int j=i+1;j<n;j++){
                if(arr[j]>=arr[i]){
                    isLeader = false;
                    break;
                }
            }
            if(isLeader){
                res.add(arr[i]);
            }
        }
        return res;

    }
}
public class Brute {
    public static void main(String[] args) {
        BruteSolution sol = new BruteSolution();
        int[] arr = {4,7,1,0};
        ArrayList<Integer> res = sol.leaders(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
