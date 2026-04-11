package FindMissingNumber;
class OptimalSolution{
    public int missingNumber(int[] arr){
        int n = arr.length+1;
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor2^=arr[i];
        }
        for(int i=1;i<=n;i++){
            xor1^=i;  
        }
        return xor1^xor2;
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {1,2,4,5};
        int missing = sol.missingNumber(arr);
        System.out.println("The missing number is: " + missing);
    }
}
