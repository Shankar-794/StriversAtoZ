package Remove_Duplicates;
import java.util.Arrays;
import java.util.HashSet;
class BruteSolution{
    public int removeDup(int[] arr, int n){
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
                arr[index++] = num;
            }
        }
        return index;
    }
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {1, 2, 4, 7, 7, 5};
        int newLength = sol.removeDup(arr, arr.length);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
