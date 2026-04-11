package unionOfTwoSortedArrays;
import java.util.ArrayList;
class TwoPointerSolution{
    public ArrayList<Integer> unionofArrays(int[] arr1, int[] arr2, int n, int m){
        ArrayList<Integer> union = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                    i++;
                }
            }else if(arr2[j] < arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                    j++;
                }
            }else{
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
}
public class TwoPointer {
    public static void main(String[] args){
        TwoPointerSolution sol = new TwoPointerSolution();
        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {2,3,5,7};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> result = sol.unionofArrays(arr1,arr2,n,m);
        System.out.println("Union of the two sorted arrays: " + result);
    }
}
