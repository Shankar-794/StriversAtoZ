package leftRotateByOne;
import java.util.Arrays;
class BruteSolution{
    public int[] leftRotateByOne(int[] arr, int n){
        int[] res = new int[n];
        for(int i=1;i<n;i++){
            res[i-1] = arr[i];
        }
        res[n-1] = arr[0];
        return res;
    }
}

public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {1,2,3,4,5};
        int[] result = sol.leftRotateByOne(arr, arr.length);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after left rotation by one: " + Arrays.toString(result));
    }
}
