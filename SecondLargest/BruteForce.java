package SecondLargest;
import java.util.Arrays;
class Solution{
    public void getElements(int[] arr, int n){
        if(n==0 || n==1){
            System.out.println(-1+" " + -1 );
        }
        Arrays.sort(arr);//Time Complexity: O(nlogn) and Space Complexity: O(1)
        System.out.println("Second Smallest: "+arr[1]);
        System.out.println("Second Largest: "+arr[n-2]);
    }
}
public class BruteForce {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1, 2, 4, 7, 7, 5};
        sol.getElements(arr, arr.length);
    }
}
