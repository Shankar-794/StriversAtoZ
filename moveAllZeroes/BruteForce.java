package moveAllZeroes;
import java.util.Arrays;
class BruteSolution{
    public int[] moveZeroes(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0; 
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[index] = arr[i];
                index++;
            }
        }   
        for(int i=0;i<n;i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {0,1,0,3,12};
        System.out.println("Original array: " + Arrays.toString(arr));
        int[] result = sol.moveZeroes(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(result));
    }
}
