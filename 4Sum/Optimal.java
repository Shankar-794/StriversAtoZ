import java.util.*;
class OptimalSolution{
    public List<List<Integer>> threeSum(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && arr[j]==arr[j]){
                    int left = i+1, right = n-1;
                    while(left<right){
                        long sum = (long)arr[i]+arr[j]+arr[left]+arr[right];
                        if(sum==0){
                            res.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));
                            left++;
                            right--;
                            while(left<right && arr[left]==arr[left-1]) left++;
                            while(left<right && arr[right]==arr[right-1]) right--;
                        }
                        else if(sum<0) left++;
                        else right--;
                    }
                }
            }
        }
        return res;
    }

}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
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
