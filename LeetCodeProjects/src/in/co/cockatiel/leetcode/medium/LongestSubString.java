package in.co.cockatiel.leetcode.medium;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }

        String dummy = "";
        char[] sArray = s.toCharArray();
        int largest = 0;
        for(Character c : sArray){
            try {
                int dummyLength = dummy.length();
                System.out.println(c.toString());
                if (dummy.equals("")) {
                    System.out.println("First");
                    dummy = c.toString();
                } else if (!dummy.contains(c.toString())) {
                    System.out.println("Second");
                    dummy = dummy.concat(c.toString());
                }
//            else if(dummy.substring(0,1).equals(c.toString())) {
//                System.out.println("Third");
//                dummy = dummy.substring(1,dummyLength).concat(c.toString());
//            }
                else if (largest < dummy.length()) {
                    System.out.println("Fourth");
                    largest = dummy.length();
                    int charIndex = dummy.indexOf(c.toString());
                    dummy = dummy.substring(charIndex, dummyLength).replaceAll(c.toString(), "").concat(c.toString());
                } else {
                    System.out.println("Fifth");
                    int charIndex = dummy.indexOf(c.toString());
                    dummy = dummy.substring(charIndex, dummyLength).replaceAll(c.toString(), "").concat(c.toString());
                }
                System.out.println(largest + " " + dummy);
            }catch (Exception ex){
                largest = largest - 1;
            }
        }
        if(largest < dummy.length()){
            largest = dummy.length();
        }
        return  largest;
    }

//    public int lengthOfLongestSubstring2(String s) {
//
//        int length = -1;
//        //char[] sArray = s.toCharArray();
//        String dummy = "";
//        for(Character sArray : s.toCharArray()){
//            if(dummy.contains(sArray.toString())){
//                int index = dummy.lastIndexOf(sArray.toString()) + 1;
//                length = (length-index>0)?(length-index):1;
//            }else{
//                length++;
//            }
//        }
//        return  length;
//    }

}
