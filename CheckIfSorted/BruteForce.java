package CheckIfSorted;
class BruteSolution{
    public boolean isSorted(int[] arr, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {1,2,6,5};
        System.out.println(sol.isSorted(arr, arr.length));
    }
}
