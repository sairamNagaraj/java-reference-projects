package in.co.cockatiel.leetcode.easy;

public class MaximumSubarray {

    public int maxSubArrayMySolution(int[] nums) {

        int largest = nums[0];
        for(int i : nums) if (i > largest) largest = i;

        for(int i=0;i<nums.length;i++){
            int total = nums[i];
            for(int j=i+1;j<nums.length;j++){
                total=total+nums[j];
                if(total>largest){
                    largest = total;
                }
            }
        }
        return largest;
    }

    public int maxSubArray(int[] nums) {

        int largest = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(max+nums[i]>nums[i]){
                max =max+ nums[i];
            }else{
                max = nums[i];
            }
             if(max>largest){
                 largest = max;
             }
        }
        return largest;
    }
}
