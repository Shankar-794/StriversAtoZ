package TwoSum;
class BruteSolution{
    public int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
public class Brute {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = sol.twoSum(arr, target);
        if(result[0]!=-1){
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
