import java.io.*;
import java.util.StringTokenizer;

public class boj2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(new StringBuilder(tokenizer.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(tokenizer.nextToken()).reverse().toString());
        writer.append(String.valueOf(Math.max(a, b)));
        writer.close();
    }
}