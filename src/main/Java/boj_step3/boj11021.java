import java.io.*;
import java.util.StringTokenizer;

public class boj11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int i = 1;
        while (i <= n) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            writer.append("Case #" + i++ + ": " +  (a + b));
            writer.newLine();
        }
        writer.close();
    }
}
