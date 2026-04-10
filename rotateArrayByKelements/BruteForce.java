package rotateArrayByKelements;
import java.util.Arrays;
class BruteSolution{
    public void rotateRight(int[] arr, int k){
        int n = arr.length;
        int[] temp = new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-(n-k)] = arr[i];
        }

        for(int i=n-k-1;i>=0;i--){
            arr[i+k] = arr[i];
        }

        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }
    }
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        sol.rotateRight(arr, k);
        System.out.println("Array after right rotation by " + k + " elements: " + Arrays.toString(arr));
    }
}
