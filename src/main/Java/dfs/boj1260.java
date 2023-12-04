import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class boj1260 {
    private static ArrayList<Integer>[] linked;
    private static boolean[] isVisited;
    private static StringBuilder builder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int v = Integer.parseInt(tokenizer.nextToken());
        linked = new ArrayList[n + 1];
        isVisited = new boolean[n + 1];
        IntStream.range(1, n + 1).forEach(index -> linked[index] = new ArrayList<>());
        while(m-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            linked[x].add(y);
            linked[y].add(x);
        }
        IntStream.range(1, n + 1).forEach(index -> Collections.sort(linked[index]));
        dfs(v);
        writer.append(builder);
        writer.newLine();
        IntStream.range(1, n + 1).forEach(index -> isVisited[index] = false);
        builder = new StringBuilder();
        bfs(v);
        writer.append(builder).close();
    }
    private static void dfs(int n) {
        if (isVisited[n]) return;
        isVisited[n] = true;
        builder.append(n).append(' ');
        linked[n].forEach(x -> dfs(x));
    }

    private static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        builder.append(n).append(' ');
        isVisited[n] = true;
        while (!q.isEmpty()) {
            int c = q.poll();
            linked[c].forEach(it -> {
                if (!isVisited[it]) {
                    q.offer(it);
                    builder.append(it).append(' ');
                    isVisited[it] = true;
                }
            });
        }
    }
}
