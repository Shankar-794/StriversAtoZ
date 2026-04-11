package unionOfTwoSortedArrays;
import java.util.*;
class SetSolution{
    public ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new TreeSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            set.add(num);
        }
        return new ArrayList<>(set);
    }

}
public class UsingSet {
    public static void main(String[] args){
        SetSolution sol = new SetSolution();
        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {2,3,5,7};
        ArrayList<Integer> result = sol.unionOfArrays(arr1,arr2);
        System.out.println("Union of the two sorted arrays: " + result);
    }
}
