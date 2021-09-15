package in.co.cockatiel.leetcode.medium;

import java.sql.SQLOutput;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if(s.isEmpty() || s==null){
            return "";
        }
        String result = String.valueOf(s.charAt(0));
        for(int i = 0; i<s.length();i++){
            String sShrt = s.substring(i,s.length());
            if(result.length()>sShrt.length()){
                break;
            }
            //System.out.println("Loop "+ (i+1) + " String input "+sShrt);
            while(sShrt.lastIndexOf(String.valueOf(s.charAt(i))) != 0){
                //System.out.println("Why");
                int lastIndexOfChar = sShrt.lastIndexOf(String.valueOf(s.charAt(i)));
                StringBuffer stringRev = new StringBuffer(sShrt.substring(0,lastIndexOfChar+1));
                if(stringRev.toString().equals(stringRev.reverse().toString()) && stringRev.toString().length()>result.length()){
                    result = stringRev.toString();
                    break;
                }
                sShrt=sShrt.substring(0,lastIndexOfChar);
            }
        }
        return result;
    }
}
