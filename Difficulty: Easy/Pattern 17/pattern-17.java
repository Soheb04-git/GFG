class Solution {

    void printTriangle(int n) {
        // code here
        int i,j,k;
        for(i = 1; i <= n; i++){
            char ch = 'A';
            for(j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            ch -= 2;
            for(j = 1; j <= i-1; j++){
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}