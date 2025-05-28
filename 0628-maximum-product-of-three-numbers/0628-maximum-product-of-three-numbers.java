class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int q=nums[n-1]*nums[n-2]*nums[n-3];
        int h=nums[0]*nums[1]*nums[n-1];
        return q<h? h:q;
        
    }
}