class OptimalSolution{
    public int maxProfit(int[] arr){
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;   
        int n = arr.length;
        for(int price: arr){
            if(price<minPrice){
                minPrice = price;
            }
            else{
                profit = Math.max(profit, price-minPrice);
            }
        }
        return profit;
    }
}
public class Optimal {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        OptimalSolution sol = new OptimalSolution();
        System.out.println(sol.maxProfit(arr));
    }
}
