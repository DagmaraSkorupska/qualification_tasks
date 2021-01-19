
public class Fibonacci {

    public long fibR(int n) {
        if ((n == 1) || n == 2) {
            return 1;
        } else {
            return fibR(n - 1) + fibR(n - 2);
        }
    }

    public int fibI(int n) {
        int elementA = 0;
        int elementB = 1;
        int result = 0;

        if ((n == 1) || n == 2) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                result = elementA + elementB;
                elementA = elementB;
                elementB = result;
            }
        }
        return result;
    }

}
