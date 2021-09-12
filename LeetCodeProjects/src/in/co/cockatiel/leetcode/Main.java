package in.co.cockatiel.leetcode;

import in.co.cockatiel.leetcode.easy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        TwoSum twoSum = new TwoSum();
//        int[] input = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(twoSum.twoSum(input,7)));

//        ReverseInteger reverseInteger = new ReverseInteger();
//        System.out.println(reverseInteger.reverse(-2147483648));

//        PalindromeNumber palindromeNumber = new PalindromeNumber();
//        System.out.println(palindromeNumber.isPalindrome(1121));

//        RomanToInteger romanToInteger = new RomanToInteger();
//        System.out.println(romanToInteger.romanToInt("MCMXCIV"));

//        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//        String[] input = {"fliwer","flow","floght"};
//        String[] input2 = {"aaa","a","ccc"};
//        String[] input3 = {"dog","car","xyza"};
//        String[] input4 = {"flower","flower","flower"};
//        String[] input5 = {"one"};
//        System.out.println("Input "+longestCommonPrefix.longestCommonPrefix(input));
//        System.out.println("Input2 "+longestCommonPrefix.longestCommonPrefix(input2));
//        System.out.println("Input3 "+longestCommonPrefix.longestCommonPrefix(input3));
//        System.out.println("Input4 "+longestCommonPrefix.longestCommonPrefix(input4));
//        System.out.println("Input5 "+longestCommonPrefix.longestCommonPrefix(input5));

        String vpInput = "";
        String vpInput1 = "[]";
        String vpInput2 = "[({})]";
        String vpInput3 = "[](){}";
        String vpInput4 = "[({})";
        String vpInput5 = "[({}))";
        String vpInput6 = "[({)]}";
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println("Input "+validParentheses.isValid(vpInput));
        System.out.println("Input "+validParentheses.isValid(vpInput1));
        System.out.println("Input "+validParentheses.isValid(vpInput2));
        System.out.println("Input "+validParentheses.isValid(vpInput3));
        System.out.println("Input "+validParentheses.isValid(vpInput4));
        System.out.println("Input "+validParentheses.isValid(vpInput5));
        System.out.println("Input "+validParentheses.isValid(vpInput6));

    }
}
