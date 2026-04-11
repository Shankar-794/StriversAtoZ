package FindMissingNumber;
class NaieveSolution{
    public int missingNumber(int[] arr){
        int n = arr.length+1;
        for(int i=1;i<=n;i++){
            boolean found = false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }
}
public class Naive {
    public static void main(String[] args){
        NaieveSolution sol = new NaieveSolution();
        int[] arr = {1,2,4,5};
        int missing = sol.missingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }
}
