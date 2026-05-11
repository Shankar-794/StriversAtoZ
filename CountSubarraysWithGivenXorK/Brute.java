
class BruteSolution{
    public int cntOfSubArr(int[] arr,int k){
        int n = arr.length;
        int cnt = 0;
        
        for(int i=0;i<n;i++){
            int xor = 0;
            for(int j=i;j<n;j++){
                xor^=arr[j];
                if(xor==k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
public class Brute {
    public static void main(String[] args) {
        BruteSolution sol = new BruteSolution();
    int[] arr = {5, 6, 7, 8, 9};
    int k = 5;
    System.out.print(sol.cntOfSubArr(arr,k));
    }
}
