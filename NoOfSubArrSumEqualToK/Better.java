class BetterSolution{
    public int subArrCount(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
public class Better {
    public static void main(String[] args) {
        BetterSolution sol = new BetterSolution();
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int res = sol.subArrCount(arr, 3);
        System.out.println(res);
    }
}
