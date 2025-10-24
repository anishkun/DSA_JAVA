package Arrays;
import java.util.*;
public class LongestConsecutiveSequence {
    HashSet<Integer> ht = new HashSet<>();
        for(int num : nums){
        ht.add(num);
    }
    int max = 0;
        for(int num : ht){

        if(!(ht.contains(num-1))){
            int temp = num;
            int count = 0;
            while(ht.contains(temp)){
                count++;
                temp++;
            }
            max = Math.max(max,count);
        }
    }
        return max;
}
}
