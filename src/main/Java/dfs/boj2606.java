import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class boj2606 {
    private static ArrayList<Integer>[] linked;
    private static boolean[] isInfected;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        linked = new ArrayList[n + 1];
        IntStream.range(1, n + 1).forEach(index -> linked[index] = new ArrayList<>());
        isInfected = new boolean[n + 1];
        while (k-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            linked[x].add(y);
            linked[y].add(x);
        }
        infect(1);
        writer.append(String.valueOf(count - 1)).close();
    }

    private static void infect(int n) {
        if (isInfected[n]) return;
        isInfected[n] = true;
        count++;
        linked[n].forEach(boj2606::infect);
    }
}