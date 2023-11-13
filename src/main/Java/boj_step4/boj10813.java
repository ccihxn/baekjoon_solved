import java.io.*;
import java.util.StringTokenizer;

public class boj10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int[] basket = new int[n];
        for (int i = 0; i < n; i++) basket[i] = i + 1;
        while (m --> 0)  {
            tokenizer = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(tokenizer.nextToken()) - 1;
            int j = Integer.parseInt(tokenizer.nextToken()) - 1;
            int tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
        }
        for (int ball: basket) writer.append(ball + " ");
        writer.close();
    }
}
