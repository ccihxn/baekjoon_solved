import java.io.*;
import java.util.StringTokenizer;

public class boj2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int r = Integer.parseInt(tokenizer.nextToken());
            char[] s = tokenizer.nextToken().toCharArray();
            for (char c: s) {
                int index = r;
                while (index-- > 0) writer.append(c);
            }
            writer.newLine();
        }
        writer.close();
    }
}