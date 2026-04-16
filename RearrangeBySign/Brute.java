import java.util.ArrayList;
class BruteSolution{
    public int[] rearrangeBySign(int[] arr){
        int n = arr.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            arr[2*1] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }
}
public class Brute{
    public static void main(String[] args) {
        BruteSolution sol = new BruteSolution();
        int[] arr = {1,2,-4,-5};
        int[] res = sol.rearrangeBySign(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}