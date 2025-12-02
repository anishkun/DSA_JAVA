package Strings;

public class FillAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {

        int[] need = new int[26];
        int[] have = new int[26];
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length())return res;
        for(int i=0;i<p.length();i++){
            need[p.charAt(i) - 'a']++;
            have[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(have,need)){
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            char c = s.charAt(i);
            have[c-'a']++;
            c = s.charAt(i-p.length());
            have[c-'a']--;
            if(Arrays.equals(have,need)){
                res.add(i-p.length()+1);
            }
        }

        return res;


    }
}
