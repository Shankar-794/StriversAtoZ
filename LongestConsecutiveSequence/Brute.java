class BruteSolution{
    private boolean linearSearch(int[] a, int y){
        for(int i=0;i<a.length;i++){
            if(a[i]==y) return true;
        }
        return false;
    }
    public int longestConsecutive(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        int maxLen = 1;
        for(int i=0;i<n;i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x+1)==true){
                x = x+1;
                count++;
            }
            maxLen = Math.max(maxLen,count);
        }
        return maxLen;
    }
}
public class Brute {
    public static void main(String[] args){
        BruteSolution  sol = new BruteSolution();
        int[] arr = {100, 4, 200, 1, 3, 2};
        int res = sol.longestConsecutive(arr);
        System.out.println(res);
    }
}
