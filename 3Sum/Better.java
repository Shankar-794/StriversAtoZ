
import java.util.*;
class BetterSolution{
    public List<List<Integer>> threeSum(int[] arr){
        int n = arr.length;
        HashSet<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> st2 = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int comp = -(arr[i]+arr[j]);
                if(st2.contains(comp)){
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],comp);
                    Collections.sort(temp);
                    st.add(temp);
                }
                st2.add(arr[j]);
            }
        }
        return new ArrayList<>(st);
    }
}
public class Better {
    public static void main(String[] args){
        BetterSolution sol = new BetterSolution();
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = sol.threeSum(arr);
        for(List<Integer> triplet: res ){
            for(int num:triplet){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
