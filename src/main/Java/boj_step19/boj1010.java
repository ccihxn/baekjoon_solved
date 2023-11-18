import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class boj1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            BigInteger mfac = BigInteger.valueOf(1);
            BigInteger nfac = BigInteger.valueOf(1);
            for (int i = m - n + 1; i <= m; i++) mfac = mfac.multiply(BigInteger.valueOf(i));
            for (int i = 1; i <= n; i++) nfac = nfac.multiply(BigInteger.valueOf(i));
            writer.append(mfac.divide(nfac) + "\n");
        }
        writer.close();
    }
}