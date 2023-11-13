import java.io.*;
import java.util.StringTokenizer;

public class boj10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            while (true) {
                String string = reader.readLine();
                StringTokenizer tokenizer = new StringTokenizer(string);
                int a = Integer.parseInt(tokenizer.nextToken());
                int b = Integer.parseInt(tokenizer.nextToken());
                writer.append(String.valueOf(a + b));
                writer.newLine();
                writer.flush();
            }
        } catch (Exception e) { e.getMessage(); }
    }
}
