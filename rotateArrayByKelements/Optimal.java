package rotateArrayByKelements;
import java.util.Arrays;
class OptimalSolution{
    public void reverse(int[] arr,int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotateRight(int[] arr, int k){
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {1,2,3,4,5};
        int k = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        sol.rotateRight(arr, k);
        System.out.println("Array after right rotation by " + k + " elements: " + Arrays.toString(arr));
    }
}
