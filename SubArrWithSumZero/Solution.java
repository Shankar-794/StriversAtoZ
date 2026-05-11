import java.util.*;
public class Solution {
    public static int maxLen(int[] arr){
        int n = arr.length;
        int maxi = 0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxi = i+1;
            }
            else{
                if(map.containsKey(sum)){
                    maxi = Math.max(maxi,i-map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLen(arr));
    }
}
