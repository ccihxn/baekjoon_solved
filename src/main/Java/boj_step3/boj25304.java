import java.io.*;
import java.util.StringTokenizer;

public class boj25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int sumPrice = 0;
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int price = Integer.parseInt(tokenizer.nextToken());
            int count = Integer.parseInt(tokenizer.nextToken());
            sumPrice += price * count;
        }
        writer.append((sumPrice == total) ? "Yes" : "No");
        writer.close();
    }
}
