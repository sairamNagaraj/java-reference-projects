package in.co.cockatiel.leetcode.medium;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        if(num==0){
            return "";
        }
        String roman = "";
        Map<Integer,String> romanMap = new HashMap<Integer,String>();
        romanMap.put(1,"I");
        romanMap.put(5,"V");
        romanMap.put(10,"X");
        romanMap.put(50,"L");
        romanMap.put(100,"C");
        romanMap.put(500,"D");
        romanMap.put(1000,"M");
        int index = 0;
        while(true){
            if(index>=Integer.toString(num).length()){
                break;
            }
            int pos = (int) Math.pow(10,index);
            int currnum = num % ((int)Math.pow(10,index+1));
            num = ((num / (10*pos))*(10*pos));
            System.out.println("Curr Num "+currnum);
            if((double)currnum/4==(double)pos){
                System.out.println("if");
                roman = (romanMap.get(1*pos)+romanMap.get(5*pos)).concat(roman);
            }else if((double)currnum/9==(double)pos){
                System.out.println("else..if..1");
                roman = (romanMap.get(1*pos)+romanMap.get(10*pos)).concat(roman);
            }else if(currnum == (5*pos)){
                roman=(romanMap.get(currnum)).concat(roman);
            }
            else if(currnum < (5*pos)){
                System.out.println("else..if..2");
                for(int i=0;i<currnum/pos;i++){
                    roman=(romanMap.get(pos)).concat(roman);
                }
            }else{
                System.out.println("else");
                for(int i=0;i<(currnum-(5*pos))/pos;i++){
                    roman=(romanMap.get(pos)).concat(roman);
                }
                roman = (romanMap.get(5*pos)).concat(roman);
            }
            System.out.println("Roman at index :"+index+" is "+roman);
            index++;
        }

        //StringBuffer srev = new StringBuffer(roman).reverse();
        return roman;
    }
}
