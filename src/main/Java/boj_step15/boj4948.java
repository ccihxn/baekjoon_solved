import java.io.*;
import java.util.Arrays;

public class boj4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] isPrime = new boolean[250_001];
        Arrays.fill(isPrime, true);
        for (int i = 2; i <= isPrime.length / 2; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * 2; j < isPrime.length; j += i) isPrime[j] = false;
        }
        String line;
        while (!(line = reader.readLine()).equals("0")) {
            int n = Integer.parseInt(line);
            int ans = 0;
            for (int i = n + 1; i <= n * 2; i++) if (isPrime[i]) ans++;
            writer.append(ans + "\n");
        }
        writer.close();
    }
}