package Arrays;
import java.util.*;
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Create buckets where index = frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freq.keySet()) {
            int f = freq.get(key);
            if (bucket[f] == null) bucket[f] = new ArrayList<>();
            bucket[f].add(key);
        }

        // Collect top K from the end
        List<Integer> res = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && res.size() < k; i--) {
            if (bucket[i] != null)
                res.addAll(bucket[i]);
        }

        // Convert to array
        int[] ans = new int[k];
        for (int i = 0; i < k; i++)
            ans[i] = res.get(i);
        return ans;
    }
}
