package in.co.cockatiel.leetcode.easy;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int pos = 0, index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                pos = i;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=val){
                        nums[pos] = nums[j];
                        pos++;
                        index++;
                    }else{
                        nums[j]=-1;
                    }
                }
                break;
            }else{
                index++;
            }
        }
        return index;
    }
}
