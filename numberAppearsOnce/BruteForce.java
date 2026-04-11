package numberAppearsOnce;
class BruteSolution{
    public int getSingleElement(int[] arr){
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count==1){
                return arr[i];
            }
        }
        return -1;
    }
}
public class BruteForce {
    public static void main(String[] args){
        BruteSolution sol = new BruteSolution();
        int[] arr = {4,1,2,1,2};
        int singleElement = sol.getSingleElement(arr);
        System.out.println("The single element is: " + singleElement);
    }
}
