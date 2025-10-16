package Strings;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {


        HashMap<String,List<String>> hp = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            hp.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(hp.values());
    }
}
