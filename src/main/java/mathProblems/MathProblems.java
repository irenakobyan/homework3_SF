package mathProblems;

public class MathProblems {

    public static int sum(int a, int b) {
        if (a > b)
            return a + b;
        else
            return b;
    }

    public static int multiply(int a, int b) {
        if (a / b > 1)
            return a * b;
        else
            return a / b;
    }

    public static boolean even(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    public static int reverse(int a) {
        int reversed = 0;
        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a /= 10;
        }
        return reversed;
    }
}

