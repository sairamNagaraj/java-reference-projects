package in.co.cockatiel.leetcode.easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int arrayLength = nums.length - 1;
        int[] solution = new int[2];
        for(int i = 0; i<=arrayLength; i++){
            for(int j=0;j<arrayLength;j++){
                if(i!=j && target==(nums[i]+nums[j])){
                    solution[0]=i;
                    solution[1]=j;
                }
            }
        }
        return solution;
    }
}
