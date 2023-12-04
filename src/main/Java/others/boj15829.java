import java.io.*;
import java.math.BigInteger;

public class boj15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        char[] line = reader.readLine().toCharArray();
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            int tmp = line[i] - 'a' + 1;
            BigInteger base = BigInteger.valueOf(31);
            BigInteger exponent = base.pow(i);
            BigInteger tmpBigInt = BigInteger.valueOf(tmp);
            sum = sum.add(tmpBigInt.multiply(exponent));
        }
        writer.append(sum.mod(BigInteger.valueOf(1234567891)).toString()).close();
    }
}
