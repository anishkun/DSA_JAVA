package Strings;

public class ValidPalindrome {

        public boolean isPalindrome(String s) {

            char[] chars = s.toCharArray();
            for(int i=0; i<chars.length;i++){
                if(chars[i]>='A' && chars[i] <='Z')
                    chars[i]=(char) (chars[i]+32);
            }
            int left=0;
            int  right=chars.length-1;
            while (left<right) {
                if(!(chars[left]>='a' && chars[left]<='z') && !(chars[left]>='0' && chars[left]<='9')){
                    left++;
                    continue;
                }
                if(!(chars[right]>='a' && chars[right]<='z') && !(chars[right]>='0' && chars[right]<='9')){
                    right--;
                    continue;
                }
                if(chars[left] != chars[right])
                    return false;
                left++;
                right--;

            }
            return true;
        }

}
