package CheckIfSorted;
class OptimalSolution{
    public boolean isSorted(int[] arr, int n){
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {1,2,3,4,5};//true
        int[] arr1= {6,2,3,4,5};//false
        System.out.println(sol.isSorted(arr, arr.length));
    }
}
