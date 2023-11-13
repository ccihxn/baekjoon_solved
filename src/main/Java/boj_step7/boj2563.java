import java.io.*;
import java.util.StringTokenizer;

public class boj2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[][] paper = new boolean[100][100];
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken()) - 1;
            int y = Integer.parseInt(tokenizer.nextToken()) - 1;
            for (int i = x; i <= x + 9; i++)
                for (int j = y; j <= y + 9; j++) {
                    if (!paper[i][j]) count++;
                    paper[i][j] = true;
                }
        }
        writer.append(String.valueOf(count));
        writer.close();
    }
}
