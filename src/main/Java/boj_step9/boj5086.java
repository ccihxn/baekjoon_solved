import java.io.*;
import java.util.StringTokenizer;

public class boj5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            if (a == 0 && b == 0) break;
            if (a % b == 0) writer.append("multiple");
            else if (b % a == 0) writer.append("factor");
            else writer.append("neither");
            writer.newLine();
        }
        writer.close();
    }
}