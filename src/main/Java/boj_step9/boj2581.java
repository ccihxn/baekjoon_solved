import java.io.*;
import java.math.BigInteger;

public class boj2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        long m = Long.parseLong(reader.readLine());
        long n = Long.parseLong(reader.readLine());
        long min = BigInteger.valueOf(m).nextProbablePrime().longValue(), sum = 0L;
        if (BigInteger.valueOf(m).isProbablePrime(10)) {
            min = m;
            sum = m;
        }
        while (m <= n) {
            m = BigInteger.valueOf(m).nextProbablePrime().longValue();
            if (m > n) break;
            sum += m;
        }
        if (sum == 0L) writer.append("-1").close();
        else {
            writer.append(String.valueOf(sum));
            writer.newLine();
            writer.append(String.valueOf(min)).close();
        }
    }
}