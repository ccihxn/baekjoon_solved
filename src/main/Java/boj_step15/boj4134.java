import java.io.*;
import java.math.BigInteger;

public class boj4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            BigInteger x = new BigInteger(reader.readLine());
            if (x.isProbablePrime(10)) writer.append(x + "\n");
            else writer.append(x.nextProbablePrime() + "\n");
        }
        writer.close();
    }
}
