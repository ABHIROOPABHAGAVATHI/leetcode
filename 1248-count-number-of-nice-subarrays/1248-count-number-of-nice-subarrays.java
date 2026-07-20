class Solution {
     public static int helper(int nums[],int k){ 
        int l=0;int c=0;int ans=0;int r=0;
        while(r<=nums.length-1){
            if(nums[r]%2==1){
                c++;
            }
            while(c>k){
            if(nums[l]%2==1){
                c--;
            }
               l++;
            }
            r++;
            ans=ans+r-l+1;

        }
        return ans;
        }
    public int numberOfSubarrays(int[] nums, int k) {
        int res=helper(nums,k)- helper(nums,k-1);
        return res;
    }
}