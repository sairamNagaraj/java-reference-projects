package in.co.cockatiel.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        StringBuilder srev = new StringBuilder(s).reverse();
        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        char[] s1 = srev.toString().toCharArray();
        System.out.println(Arrays.toString(s1));
        int total = 0;
        for(int i=0;i<s1.length;i++){
            int num = romanMap.get(s1[i]);
            System.out.println(s1[i] +" : "+ romanMap.get(s1[i]));
            if((i+1)<s1.length) {
                System.out.println(s1[i + 1] + " : " + romanMap.get(s1[i + 1]));
                if (romanMap.get(s1[i]) > romanMap.get(s1[i + 1])) {
                    num = romanMap.get(s1[i]) - romanMap.get(s1[i+1]);
                    i++;
                }
            }
            System.out.println("num at i: "+num);
            total = total + num;
            System.out.println("total at i: "+total);
        }
        return total;
    }
}
