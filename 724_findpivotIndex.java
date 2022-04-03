class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int ls=0,rs=sum;
        for(int i=0;i<nums.length;i++)
        {
            rs-=nums[i];
            if(ls==rs)
            {
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}