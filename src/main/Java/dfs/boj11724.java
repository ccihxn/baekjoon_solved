import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class boj11724 {
    private static boolean[] isVisited;
    private static ArrayList<Integer>[] linked;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        isVisited = new boolean[n + 1];
        linked = new ArrayList[n + 1];
        IntStream.range(1, n + 1).forEach(index -> linked[index] = new ArrayList<>());
        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            linked[x].add(y);
            linked[y].add(x);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!isVisited[i]) {
                count++;
                dfs(i);
            }
        }
        writer.append(String.valueOf(count)).close();
    }
    private static void dfs (int n) {
        if (isVisited[n]) return;
        isVisited[n] = true;
        for (int i: linked[n]) if (!isVisited[i]) dfs(i);
    }
}