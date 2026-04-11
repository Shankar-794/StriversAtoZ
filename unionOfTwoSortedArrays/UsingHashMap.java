package unionOfTwoSortedArrays;
import java.util.*;
class MapUnion{
 ArrayList<Integer> mapUnion(int[] arr1,int[] arr2, int n, int m){
    TreeMap<Integer,Integer> map =new TreeMap<>();
    for(int i=0;i<n;i++){
        map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
    }
    for(int i=0;i<m;i++){
        map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
    }
    ArrayList<Integer> union  = new ArrayList<>();
    for(int num:map.keySet()){
        union.add(num);
    }
    return union;
}
}  
    
public class UsingHashMap {
    public static void main(String[] args){
        MapUnion sol = new MapUnion();
        int[] arr1 = {1,2,4,5,6};
        int[] arr2 = {2,3,5,7};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> result = sol.mapUnion(arr1,arr2,n,m);
        System.out.println("Union of the two sorted arrays: " + result);
    }
}
