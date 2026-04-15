
class OptimalSolution{
    public int maxSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
public class Optimal {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        OptimalSolution sol = new OptimalSolution();
        System.out.println(sol.maxSubarray(arr));
    }
}
