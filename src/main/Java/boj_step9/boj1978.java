import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class boj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine()), count = 0;
        long[] primes = new long[n];

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < primes.length; i++) {
            primes[i] = Long.parseLong(tokenizer.nextToken());
            if (BigInteger.valueOf(primes[i]).isProbablePrime(10)) count++;
        }
        writer.append(String.valueOf(count)).close();
    }
}
