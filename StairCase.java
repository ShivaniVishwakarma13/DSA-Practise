public class StairCase {

    public static int countWay(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 8;

        System.out.println("Number of ways: " + countWay(n));
    }
}

