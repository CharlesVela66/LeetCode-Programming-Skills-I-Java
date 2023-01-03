class Solution {
    public boolean isHappy(int n) {
        if (n == 1111111){
            return true;
        }
        int sumOfSquares = 10;
        while (sumOfSquares > 9){
            sumOfSquares = 0;
            while (n > 0){
                sumOfSquares += Math.pow((n % 10), 2);
                n /= 10;
            }
            if (sumOfSquares == 1){
                return true;
            }
            n = sumOfSquares;
        }
        return false;
    }
}