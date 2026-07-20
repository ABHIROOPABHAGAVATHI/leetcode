class Solution {
     public static int helper(int nums[],int k){ 
        int l=0;int c=0;int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1){
                c++;
            }
            while(c>k){
            if(nums[l]%2==1){
                c--;
            }
               l++;
            }
            ans=ans+r-l+1;
        }
        return ans;
        }
    public int numberOfSubarrays(int[] nums, int k) {
        int res=helper(nums,k)- helper(nums,k-1);
        return res;
    }
}