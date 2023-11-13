import java.io.*;
import java.util.StringTokenizer;

public class boj2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());
        int v = Integer.parseInt(tokenizer.nextToken());
        int days = ((v - a) % (a - b) != 0) ? (v - a) / (a - b) + 2 : (v - a) / (a - b) + 1;
        writer.append(String.valueOf(days));
        writer.close();
    }
}