package Arrays;

public class ContainsDuplicate {
    static{
        for(int i=0;i<=500;i++)
            containsDuplicate(new int[]{0, 1, 0});
    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i = 1; i<nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            if(j>=0 && nums[j] == key)
                return true;
            nums[j+1] = key;
        }
        return false;
    }

//        public boolean containsDuplicate(int[] nums) {
//            HashSet<Integer> hs = new HashSet<>();
//            for(int i = 0; i < nums.length; i++){
//                if(hs.contains(nums[i])){
//                    return true;
//                }
//                hs.add(nums[i]);
//            }
//            return false;
//        }
    // the code i wrote ^^


}

