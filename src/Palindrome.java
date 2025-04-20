import java.util.ArrayList;

public class Palindrome {
    public boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }

        ArrayList<Integer> numValues = new ArrayList<>();

        while (n != 0) {
            numValues.add(n % 10);
            n /= 10;
        }

        for (int i = 0; i < numValues.size() / 2; i++) {
            if (numValues.get(i) != numValues.get(numValues.size() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
