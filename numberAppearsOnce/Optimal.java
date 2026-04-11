package numberAppearsOnce;
class OptimalSolution{
    public int getSingleElement(int[] arr){
        int xor = 0;
        for(int num:arr){
            xor^=num;
        }
        return xor;
    }
}
public class Optimal {
    public static void main(String[] args){
        OptimalSolution sol = new OptimalSolution();
        int[] arr = {4,1,2,1,2};
        int singleElement = sol.getSingleElement(arr);
        System.out.println("The single element is: " + singleElement);
    }
}
