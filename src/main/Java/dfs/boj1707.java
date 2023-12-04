import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class boj1707 {
    private static ArrayList<Integer>[] linked;
    private static boolean[] isVisited;
    private static int[] check;
    private static boolean isBipartite;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(reader.readLine());
        while (k-- > 0) {
            isBipartite = true;
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int v = Integer.parseInt(tokenizer.nextToken());
            int e = Integer.parseInt(tokenizer.nextToken());
            linked = new ArrayList[v + 1];
            IntStream.range(1, v + 1).forEach(x -> linked[x] = new ArrayList<>());
            isVisited = new boolean[v + 1];
            check = new int[v + 1];
            while (e-- > 0) {
                tokenizer = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(tokenizer.nextToken());
                int y = Integer.parseInt(tokenizer.nextToken());
                linked[x].add(y);
                linked[y].add(x);
            }
            for (int i = 1; i <= v; i++) {
                if (isBipartite) dfs(i);
                else break;
            }
            writer.append((isBipartite) ? "YES" : "NO").append('\n');
        }
        writer.close();
    }

    private static void dfs(int n) {
        isVisited[n] = true;
        linked[n].forEach(x -> {
            if (!isVisited[x]) {
                check[x] = (check[n] + 1) % 2;
                dfs(x);
            } else if (check[n] == check[x]) isBipartite = false;
        });
    }
}
