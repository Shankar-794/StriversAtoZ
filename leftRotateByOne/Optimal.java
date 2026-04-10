package leftRotateByOne;
import java.util.Arrays;
class OptimalSolution{
    public void leftRotateByOne(int[] arr, int n){
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {1,2,3,4,5};
        System.out.println("Original array: " + Arrays.toString(arr));
        sol.leftRotateByOne(arr, arr.length);
        System.out.println("Array after left rotation by one: " + Arrays.toString(arr));
    }
}
