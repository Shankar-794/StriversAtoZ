class BruteSolution{
    public void sortZeroOneTwo(int[] arr){
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int index = 0;   
        while(c0-->0){
            arr[index++] = 0;
        }
        while(c1-->0){
            arr[index++] = 1;
        }
        while(c2-->0){
            arr[index++] = 2;
        }
    }
}
public class Brute{
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        BruteSolution sol = new BruteSolution();
        sol.sortZeroOneTwo(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}