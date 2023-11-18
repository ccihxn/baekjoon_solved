import java.io.*;
import java.util.StringTokenizer;

public class boj11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int nfac = 1, kfac = 1;
        for (int i = n - k + 1; i <= n ; i++) nfac *= i;
        for (int i = 1; i <= k; i++) kfac *= i;
        writer.append(String.valueOf(nfac / kfac)).close();
    }
}