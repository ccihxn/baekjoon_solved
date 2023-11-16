import java.io.*;
import java.util.StringTokenizer;

public class boj5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while (!(line = reader.readLine()).equals("0 0 0")) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());
            int max = Math.max(a, Math.max(b, c));
            if (max * 2 - (a + b + c) >= 0) writer.append("Invalid\n");
            else {
                if (a == b && a == c) writer.append("Equilateral\n");
                else if (a == b || a == c || b == c) writer.append("Isosceles\n");
                else writer.append("Scalene\n");
            }
        }
        writer.close();
    }
}