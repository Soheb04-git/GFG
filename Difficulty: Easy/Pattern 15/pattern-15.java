class Solution {

    void printTriangle(int n) {
        // code here
        for(int i = 1; i <= n; i++){
            char st = 'A';
            for(int j = n; j >= i; j--){
                System.out.print(st);
                st++;
            }
            System.out.println();
        }
    }
}