class Solution {

    void printTriangle(int n) {
        // code here
        int i,j;
        char ch;
        for(i = n; i >= 1; i--){
            ch = 'A';
            for(j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}