import java.io.*;
import java.util.StringTokenizer;

public class boj10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[] basket = new int[n];
        while (m-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(tokenizer.nextToken()) - 1;
            int j = Integer.parseInt(tokenizer.nextToken()) - 1;
            int k = Integer.parseInt(tokenizer.nextToken());
            for (int index = i; index <= j; index++) basket[index] = k;
        }
        for (int ball: basket) writer.append(ball + " ");
        writer.close();
    }
}
