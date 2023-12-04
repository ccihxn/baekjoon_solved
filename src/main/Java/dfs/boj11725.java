import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class boj11725 {private static ArrayList<Integer>[] linked;
    private static boolean[] isVisited;
    private static TreeMap<Integer, Integer> result = new TreeMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        linked = new ArrayList[n + 1];
        IntStream.range(1, n + 1).forEach(index -> linked[index] = new ArrayList<>());
        isVisited = new boolean[n + 1];
        result.put(1, 0);
        for (int i = 1; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            linked[x].add(y);
            linked[y].add(x);
        }
        StringBuilder builder = new StringBuilder();
        dfs(1);
        result.remove(1);
        result.forEach((key, value) -> builder.append(value).append('\n'));
        writer.append(builder).close();
    }
    private static void dfs(int n) {
        if (isVisited[n]) return;
        isVisited[n] = true;
        linked[n].forEach(x -> {
            if (result.containsKey(x)) result.put(n, x);
            else result.put(x, n);
            dfs(x);
        });
    }
}
