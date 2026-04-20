import java.util.*;
class ApproachSolution {
    public ArrayList<Integer> spiralOrder(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int left=0, right = m-1;
        int top=0, bottom = n-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(top<=bottom && left<= right){
            for(int i=0;i<=right;i++){
            res.add(mat[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            res.add(mat[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
            res.add(mat[bottom][i]); 
        }
        }
        bottom--;
        if(left<=right){
            for(int i=bottom;i>=top;i--){
            res.add(mat[i][left]);
        }
        }
        left++;
        }
        return res;
    }
}

public class Approach{
    public static void main(String[] args){
        ApproachSolution obj = new ApproachSolution();

        // Input matrix
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            { 13,14, 15, 16 }
        };

        // Call spiralOrder function
        List ans = obj.spiralOrder(matrix);

        // Print result
        System.out.println(ans);
    }
}