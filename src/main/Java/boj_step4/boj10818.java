import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = Integer.parseInt(tokenizer.nextToken());
        int max = Arrays.stream(list).max().getAsInt();
        int min = Arrays.stream(list).min().getAsInt();
        writer.append(min + " " + max);
        writer.close();
    }
}
