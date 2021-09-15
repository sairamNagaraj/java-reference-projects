package in.co.cockatiel.leetcode.easy;

public class SeachInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int result=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result=i;
                break;
            }else if(nums[i]>target){
                return i;
            }
            else if(i==nums.length-1){
                //My assumption was to return zero when nowhere you can insert the target in between. Leetcode's assumption
                //is to insert in the last position
                result=nums.length;
            }else if(((nums[i] + nums[i+1])/2) >= target){
                result = i+1;
                break;
            }
        }
        return result;
}
}
