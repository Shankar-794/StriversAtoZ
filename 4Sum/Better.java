
import java.util.*;
class BetterSolution{
    public List<List<Integer>> fourSum(int[] arr){
        int n = arr.length;
        HashSet<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer> st2 = new HashSet<>();
                for(int k=j+1;k<n;k++){
                    long comp = (long)-(arr[i]+arr[j]+arr[k]);
                    if(st2.contains((int)comp)){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],(int)comp);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    st2.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}
public class Better {
    public static void main(String[] args){
        BetterSolution sol = new BetterSolution();
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = sol.fourSum(arr);
        for(List<Integer> quad: res ){
            System.out.println(quad);
        }
    }
}
