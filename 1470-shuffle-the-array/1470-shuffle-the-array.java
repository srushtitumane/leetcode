class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int x=0,y=n;
        for(int i=0;i<n;i++){
            arr[2*i]=nums[x++];
            arr[2*i+1]=nums[y++];
        }
        return arr;
        
    }
}