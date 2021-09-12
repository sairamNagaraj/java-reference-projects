package in.co.cockatiel.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {

    public boolean isValid(String s) {
        if(s.length()%2 != 0){
            return false;
        }else {
            List<Character> dummyList = new ArrayList<Character>();
            for(char s1 : s.toCharArray()){
                if(s1 == '{' || s1 == '(' || s1 == '['){
                    dummyList.add(s1);
                }else {
                    if (!dummyList.isEmpty()) {
                        int size = dummyList.size() - 1;
                        if(dummyList.get(size) == '{' && s1 == '}'){
                            dummyList.remove(size);
                        }else if(dummyList.get(size) == '(' && s1 == ')'){
                            dummyList.remove(size);
                        }else if(dummyList.get(size) == '[' && s1 == ']'){
                            dummyList.remove(size);
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }
                }
            }
            return dummyList.size() == 0;
        }
    }
}
