package Strings;

public class LongestRepeatingCharacterReplacement {
    static{
        for(int i = 0; i < 500; i++){
            characterReplacement("", 0);
        }
    }
    public static int characterReplacement(String s, int k) {
        int left = 0,maxfreq=0,maxLen=0;
        int count[] = new int[26];
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            count[c-'A']++;
            maxfreq = Math.max(maxfreq,count[c-'A']);
            while((right-left+1)-maxfreq>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,(right-left+1));
        }
        return maxLen;
    }
}
