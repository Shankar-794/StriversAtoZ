class BruteSolution{
    public int subArrCount(int[] arr, int k){
        int n = arr.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int x=i;x<=j;x++){
                    sum+=arr[x];
                }
                if(sum==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
public class BruteForce {
    public static void main(String[] args) {
        BruteSolution sol = new BruteSolution();
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int res = sol.subArrCount(arr, 3);
        System.out.println(res);
    }
}
