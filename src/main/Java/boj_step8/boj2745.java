import java.io.*;
import java.util.StringTokenizer;

public class boj2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        String n = tokenizer.nextToken();
        int b = Integer.parseInt(tokenizer.nextToken());
        writer.append(String.valueOf(Integer.parseInt(n, b)));
        writer.close();
    }
}
