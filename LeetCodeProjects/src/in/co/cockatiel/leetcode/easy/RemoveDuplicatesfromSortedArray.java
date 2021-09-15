package in.co.cockatiel.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        System.out.println("Hello");
        if(nums.length==0){
            return 0;
        }
        int prev = nums[0];
        int openPos = 0;
        int index = 1;
        for(int i = 1; i<nums.length; i++){
            System.out.println("Loop "+i);
            if(nums[i]<=prev){
                openPos = i;
                if(i+1<nums.length) {
                    for (int j = i + 1; j < nums.length; j++) {
                        System.out.println("Nums[j] "+nums[j]+" Prev "+prev);
                        if (nums[j] > prev) {
                            System.out.println("Inside for if");
                            nums[openPos] = nums[j];
                            nums[j] = Integer.MIN_VALUE;
                            prev = nums[openPos];
                            index++;
                            break;
                        }
                    }
                }else{
                    nums[openPos] = 0;
                }
            }else{
                index++;
                prev = nums[i];
            }
//            else{
//                nums[openPos] = nums[i];
//                prev = nums[i];
//                index++;
//            }
        }
        //System.out.println(Arrays.toString(nums));
    return index;
    }
}
