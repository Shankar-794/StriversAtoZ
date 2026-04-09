package SecondLargest;

class Solution {

    public int getSecondSmallest(int[] arr, int n) {
        if (n < 2) return -1;

        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } 
            else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }

        return (secondSmall == Integer.MAX_VALUE) ? -1 : secondSmall;
    }

    public int getSecondLargest(int[] arr, int n) {
        if (n < 2) return -1;

        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                secondLargest = large;
                large = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != large) {
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
public class Optimal {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {1, 2, 4, 7, 7, 5};
        System.out.println("Second Smallest: "+sol.getSecondSmallest(arr, arr.length));
        System.out.println("Second Largest: "+sol.getSecondLargest(arr, arr.length));
    }
}
