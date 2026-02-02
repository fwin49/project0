
/**
 * Small demo program to compute the sum 1..n.
 * Intentional off-by-one bug in sumToN to demonstrate debugging.
 */
public class App {
    public static void main(String[] args) {
        int n = 10; // default
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number, using default 10");
            }
        }

        int sum = sumToN(n);
        System.out.printf("Sum 1..%d = %d%n", n, sum);
    }

    // BUG: off-by-one - the loop should run i <= n but currently uses i < n
    static int sumToN(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
}
