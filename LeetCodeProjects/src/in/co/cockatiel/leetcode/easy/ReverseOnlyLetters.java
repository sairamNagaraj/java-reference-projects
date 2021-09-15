package in.co.cockatiel.leetcode.easy;

import java.util.regex.Pattern;

public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
    char[] output = new char[s.length()];
    int lastpos=s.length()-1;
    for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
            System.out.println("Enter if");
            for(int j=lastpos;j>=0;j--){
                if(Character.isLetter(s.charAt(j))){
                    System.out.println("Char at "+j+" is : "+s.charAt(i));
                    output[j]=s.charAt(i);
                    lastpos = j-1;
                    break;
                }
            }
        }else{
            output[i]=s.charAt(i);
        }
    }
    return String.valueOf(output);
    }

}
