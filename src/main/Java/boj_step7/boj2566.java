import java.io.*;
import java.util.StringTokenizer;

public class boj2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int limit = 9;
        int row = 0, column = 0;
        int max = -1;
        for (int i = 1; i <= limit; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 1; j <= limit; j++) {
                int key = Integer.parseInt(tokenizer.nextToken());
                if (key > max) {
                    max = key;
                    row = i;
                    column = j;
                }
            }
        }
        writer.append(String.valueOf(max));
        writer.newLine();
        writer.append(row + " " + column);
        writer.close();
    }
}