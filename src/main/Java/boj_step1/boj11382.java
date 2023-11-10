import java.io.*;
import java.util.StringTokenizer;

public class boj11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        long a = Long.parseLong(tokenizer.nextToken());
        long b = Long.parseLong(tokenizer.nextToken());
        long c = Long.parseLong(tokenizer.nextToken());
        writer.append(String.valueOf(a + b + c));
        writer.close();
    }
}
