package Remove_Duplicates;
import java.util.Arrays;
class OptimalSolution{
    public int removeDup(int[] arr, int n){
        
        int i = 0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {1, 2, 4, 7, 7, 5};
        int newLength = sol.removeDup(arr, arr.length);
        System.out.println("Array after removing duplicates: " +Arrays.toString(java.util.Arrays.copyOf(arr, newLength)));
    }
}
