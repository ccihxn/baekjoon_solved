import java.io.*;
import java.util.StringTokenizer;

public class boj10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String string = reader.readLine();
            if (string.equals("0 0")) { writer.close(); return; }
            StringTokenizer tokenizer = new StringTokenizer(string);
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            writer.append(String.valueOf(a + b));
            writer.newLine();
        }
    }
}
