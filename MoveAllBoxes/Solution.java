public class Solution {
    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        int balls = 0, moves=0;
        for(int i=0;i<n;i++){
            ans[i] = balls+moves;
            moves = moves+balls;
            balls += (boxes.charAt(i)-'0');
        }
        balls=0;
        moves=0;
        for(int i=n-1;i>=0;i--){
            ans[i]+= balls+moves;
            moves = moves+balls;
            balls += (boxes.charAt(i)-'0');
        }
        return ans;
    }
    public static void main(String[] args){
        String boxes = "110"; 
        int[] ans = minOperations(boxes);
        System.out.println(java.util.Arrays.toString(ans));
    }
}
