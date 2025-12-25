class Solution {
    public void rotate(int[] nums, int k) {
        int a=nums.length;
        k = k % a;
        int[] result= new int[a];
        for(int i =0;i<a;i++){
            result[(i+k)%a]=nums[i];
        }
        for(int i =0;i<a;i++){
            nums[i]=result[i];
        }
    }
}
