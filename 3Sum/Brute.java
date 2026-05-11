
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Collections;
class BruteSolution{
    public List<List<Integer>> sum3(int[] arr){
        HashSet<List<Integer>> st = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        st.add(temp);

                    }
                }
            }
        }
        return new ArrayList<>(st);
    }
}
public class Brute {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = sol.sum3(arr);
        for(List<Integer> triplet: res ){
            for(int num:triplet){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
