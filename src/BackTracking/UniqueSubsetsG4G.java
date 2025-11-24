package BackTracking;
import java.util.*;
public class UniqueSubsetsG4G {
    static ArrayList<ArrayList<Integer>> res;
    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        res = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(arr,temp,0);

        return res;


    }
    static void backtrack(int arr[], ArrayList<Integer> temp, int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i]==arr[i-1])continue;
            temp.add(arr[i]);
            backtrack(arr, temp, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
