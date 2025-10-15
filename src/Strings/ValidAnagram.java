package Strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int count[] = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }

        for(char c : t.toCharArray()){
            count[c-'a']--;
            if(count[c-'a'] < 0)return false;//this is efficient as both strings are of same length and if they have different character than some count will go negative
        }
        // this would count to see if all counts are zero
        //    for(int i:count){
        //     if(i!=0){
        //         return false;
        //     }
        //    }
        return true;
    }
}
