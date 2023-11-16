import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class boj1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int m = Integer.parseInt(tokenizer.nextToken());
        int n = Integer.parseInt(tokenizer.nextToken());
        for (int i = m; i <= n; i++) if (BigInteger.valueOf(i).isProbablePrime(10)) writer.append(i + "\n");
        writer.close();
    }
}