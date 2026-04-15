
class BetterSolution{
    public int maxSubarray(int[] arr){
        int max= Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
public class Better {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        BetterSolution sol = new BetterSolution();
        System.out.println(sol.maxSubarray(arr));
    }
}
