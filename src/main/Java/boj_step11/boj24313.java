import java.io.*;
import java.util.StringTokenizer;

public class boj24313 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long a1 = Long.parseLong(tokenizer.nextToken());
        long a0 = Long.parseLong(tokenizer.nextToken());
        long c = Long.parseLong(reader.readLine());
        long a = Long.parseLong(reader.readLine());
        writer.append((a1 * a + a0 <= c * a && c >= a1) ? "1" : "0").close();
    }
}