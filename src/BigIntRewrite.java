/**
 * @authot Trevor Hartman
 * @author Alexei Iachkov
 * @date 3-31-24
 * @version 1.0
 */
import java.math.BigInteger;

public class BigIntRewrite {
    public static BigInteger pow(int x, int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        } else if (n == 1) {
            return BigInteger.valueOf(x);
        } else {
            BigInteger result = BigInteger.valueOf(x);
            int count = 1;
            while (count < n) {
                result = result.multiply(BigInteger.valueOf(x));
                count++;
            }
            return result;
        }
    }
}
