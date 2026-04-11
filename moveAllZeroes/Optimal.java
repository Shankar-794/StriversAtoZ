package moveAllZeroes;
import java.util.Arrays;
class OptimalSolution{
    public void moveZeroes(int[] arr){
        int n = arr.length;
        int i = -1; 
        for(int j=0;i<n;j++){
            if(arr[j]==0){
                i=j;
                break;
            }
        }   
        if(i==-1){
            return;
        }
        for(int j=i+1;j<n;j++){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}
public class Optimal {
    OptimalSolution sol = new OptimalSolution();
        int[] arr = {0,1,0,3,12};
        System.out.println("Original array: " + Arrays.toString(arr));
        sol.moveZeroes(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
}
