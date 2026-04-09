package SecondLargest;

class Solution {
    public void getElements(int[] arr, int n){
        //Better Approach: Time Complexity: O(n) and Space Complexity: O(1) 
        if(n==0 || n==1){
            System.out.println(-1+" " + -1 );
        }

        int small = Integer.MAX_VALUE,secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            small = Math.min(arr[i],small);
            large = Math.max(arr[i],large);
        }
        for(int i=0;i<n;i++){
            if(arr[i]<secondSmall && arr[i]!=small){
                secondSmall = Math.min(arr[i],secondSmall);
            }
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge = Math.max(arr[i],secondLarge);
            }

        }
            
        System.out.println("Second Smallest: "+secondSmall);
        System.out.println("Second Largest: "+secondLarge);
            
    }
}

public class Better{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1, 2, 4, 7, 7, 5};
        sol.getElements(arr, arr.length);
    }
}
