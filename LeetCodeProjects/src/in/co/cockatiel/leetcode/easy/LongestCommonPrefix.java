package in.co.cockatiel.leetcode.easy;

import java.net.Inet4Address;
import java.util.*;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        } else {
            int minLength = strs[0].length();
            String smallWord = "";
            for (String s : strs) {
                if (s.length() <= minLength) {
                    minLength = s.length();
                    smallWord = s;
                }
            }

            String prefix = "";

            for (int i = 0; i < strs.length; i++) {
                if (!smallWord.equals(strs[i])) {
                    for (int j = 1; j <= smallWord.length(); j++) {
                        if ((strs[i].substring(0, j).equals(smallWord.substring(0, j)))) {
                            prefix = smallWord.substring(0, j);
                        }else if(j==1){
                            prefix="";
                            return prefix;
                        }
                    }
                }else{
                    prefix= smallWord;
                }
                smallWord = prefix;
            }
            return prefix;
        }
    }

}
