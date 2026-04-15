class BruteSolution{
    public int maxProfit(int[] arr){
        int profit = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=1;j<n;j++){
                if(arr[i]<arr[j]){
                    sum = arr[j] - arr[i];
                }
                profit  = Math.max(profit, sum);
            }
        }
        return profit;
    }
}
public class Brute {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        BruteSolution sol = new BruteSolution();
        System.out.println(sol.maxProfit(arr));
    }
}
