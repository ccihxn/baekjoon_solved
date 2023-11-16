import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        HashSet<String> keySet = new HashSet<>();
        int count = 0;
        while (n-- > 0) keySet.add(reader.readLine());
        while (m-- > 0) if (keySet.contains(reader.readLine())) count++;
        writer.append(String.valueOf(count)).close();
    }
}
