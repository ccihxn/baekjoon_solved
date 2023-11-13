import java.io.*;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class boj10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[] basket = IntStream.range(1, n + 1).toArray();
        while (m-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(tokenizer.nextToken()) - 1;
            int j = Integer.parseInt(tokenizer.nextToken()) - 1;
            int partition = (j - i) / 2;
            while (partition-- >= 0) {
                int tmp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = tmp;
            }
        }
        for (int ball: basket) writer.append(ball + " ");
        writer.close();
    }
}