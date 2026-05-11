import java.util.*;
class BruteSolution{
    public List<List<Integer>> fourSum(int[] arr){
        int n = arr.length;
        HashSet<List<Integer>> st = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        long sum = (long) arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum==0){
                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
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
        int[] arr = {1,0,-1,0,-2,2};
        List<List<Integer>> res = sol.fourSum(arr);
        for(List<Integer> quad: res ){
            System.out.println(quad);
        }
    }
}
