class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length;
        int high = Integer.MIN_VALUE;
        int low = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            high = Math.max(sum,high);
            low = Math.max(arr[i],low);
        }
        if(high == 0){
            return low;
        }
        return high;
    }
}
