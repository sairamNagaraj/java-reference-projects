package in.co.cockatiel.leetcode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        System.out.println("String "+s);
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        System.out.println("Builder "+s1.toString());
        if(s.equals(s1.toString())){
            return true;
        }else{
            return false;
        }
    }
}
