import java.io.*;
import java.util.StringTokenizer;

public class boj13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long a = Integer.parseInt(tokenizer.nextToken());
        long b = Integer.parseInt(tokenizer.nextToken());
        writer.append(String.valueOf((a * b) / gcd(a, b))).close();
    }
    public static long gcd (long a, long b) { if (b != 0) return gcd (b, a % b); else return a; }
}