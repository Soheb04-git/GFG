//Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        int i,j,m;
        m = 1;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j ++){
                System.out.print(m+" ");
                m++;
                
            }
            System.out.println();
        }
    }
}