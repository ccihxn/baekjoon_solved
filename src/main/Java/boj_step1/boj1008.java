import java.io.*;
import java.util.StringTokenizer;

public class boj1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int a = Integer.parseInt(tokenizer.nextToken());
        double b = Double.parseDouble(tokenizer.nextToken());
        writer.append(String.valueOf(a / b));
        writer.close();
    }
}
