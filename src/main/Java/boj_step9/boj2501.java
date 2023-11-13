import java.io.*;
import java.util.StringTokenizer;

public class boj2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int count= 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                if (++count == k) {
                    writer.append(String.valueOf(i));
                    break;
                }
        if (count < k) writer.append("0");
        writer.close();
    }
}