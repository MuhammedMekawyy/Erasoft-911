package Testt;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result=0;
        int [] res = new int[2];

        for(int i=0 ; i<nums.length ;i++) {
            result= target-nums[i];
            for(int j=i+1 ; j<nums.length ;j++)
            {
                if(nums[j]==result)
                {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }

        }

        return res ;
    }
}