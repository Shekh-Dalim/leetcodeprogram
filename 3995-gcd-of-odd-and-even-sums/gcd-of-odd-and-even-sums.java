class Solution {
    public int gcdOfOddEvenSums(int n) {
        if (n == 1)
            return 1;

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i < n * 2; i++) {
            if (i % 2 == 0)
                sumEven += i;
            else
                sumOdd += i;
        }

        int num = Math.min(sumEven, sumOdd);
        int num2 = Math.max(sumEven, sumOdd);

        while (num > 0) {
            int temp = num;

            if (num2 % num == 0)
                return num;

            num = num2 % num;
            num2 = temp;
        }

        return num;
    }
}