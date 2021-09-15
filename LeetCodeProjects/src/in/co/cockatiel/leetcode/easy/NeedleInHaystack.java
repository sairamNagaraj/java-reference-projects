package in.co.cockatiel.leetcode.easy;

public class NeedleInHaystack {

    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }else if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else{
            return -1;
        }
    }

}
