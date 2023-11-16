import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] xList = new int[n];
        int[] yList = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            xList[i] = Integer.parseInt(tokenizer.nextToken());
            yList[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int width = Arrays.stream(xList).max().getAsInt() - Arrays.stream(xList).min().getAsInt();
        int height = Arrays.stream(yList).max().getAsInt() - Arrays.stream(yList).min().getAsInt();
        writer.append(String.valueOf(width * height)).close();
    }
}