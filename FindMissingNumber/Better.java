package FindMissingNumber;
class BetterSolution{
    public int missingNumber(int[] arr){
        int n = arr.length+1;
        int[] hash = new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
}
public class Better {
    public static void main(String[] args){
        BetterSolution sol = new BetterSolution();
        int[] arr = {1,2,4,5};
        int missing = sol.missingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }
}
