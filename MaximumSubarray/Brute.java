class BruteSolution{
    public int maxSubarray(int[] arr){
        int max= Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
public class Brute {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        BruteSolution sol = new BruteSolution();
        System.out.println(sol.maxSubarray(arr));
    }
}
