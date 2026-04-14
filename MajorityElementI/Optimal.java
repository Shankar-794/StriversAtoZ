class OptimalSolution{
    public int majorityElement(int[] arr){
        int cnt = 0;
        int n = arr.length;
        int ele = 0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt = 1;
                ele = arr[i];
            }else if(ele==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==ele){
                cnt1++;
            }
        }
        if(cnt1>(n/2)){
            return ele;
        }
        return -1;
    }
}
public class Optimal {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        OptimalSolution sol = new OptimalSolution();
        System.out.println(sol.majorityElement(arr));
    }
}
