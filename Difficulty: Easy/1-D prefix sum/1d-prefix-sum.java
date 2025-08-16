class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        res.add(arr[0]);
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
            res.add(arr[i]);
        }
        return res;
    }
}