import java.io.*;
import java.util.StringTokenizer;

public class boj2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[][] procession = new int[n][m];
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) procession[i][j] = Integer.parseInt(tokenizer.nextToken());
        }
        for (int i = 0; i < n; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                procession[i][j] += Integer.parseInt(tokenizer.nextToken());
                writer.append(procession[i][j] + " ");
            }
            writer.newLine();
        }
        writer.close();
    }
}