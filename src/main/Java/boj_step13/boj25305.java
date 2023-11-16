import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        Integer[] list = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(list, Collections.reverseOrder());
        writer.append(String.valueOf(list[k - 1])).close();
    }
}