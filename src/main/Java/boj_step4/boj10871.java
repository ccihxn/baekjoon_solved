import java.io.*;
import java.util.StringTokenizer;

public class boj10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(reader.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = Integer.parseInt(tokenizer.nextToken());
        for (int it: list) { if (it < x) writer.append(it + " "); }
        writer.close();
    }
}
