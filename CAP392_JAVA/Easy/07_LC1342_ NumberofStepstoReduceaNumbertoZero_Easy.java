
class Solution {
    public int numberOfSteps(int num) {

        int count = 0;

        while (num != 0) {

            if (num % 2 == 0) {
                num = num / 2; // Even: divide by 2
            }
            else {
                num = num - 1; // Odd: subtract 1
            }

            count++; // Count each step
        }

        return count;
    }
}
