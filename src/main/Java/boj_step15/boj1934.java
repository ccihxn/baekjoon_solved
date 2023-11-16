import java.io.*;
import java.util.StringTokenizer;

public class boj1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            writer.append((a * b) / gcd(a, b) + "\n");
        }
        writer.close();
    }
    private static int gcd(int a, int b) { if (b != 0) return gcd (b, a % b); else return a; }
}
