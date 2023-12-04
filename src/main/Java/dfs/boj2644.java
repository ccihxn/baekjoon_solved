import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class boj2644 {private static ArrayList<Integer>[] linked;
    private static boolean[] isVisited;
    private static int personA;
    private static int personB;
    private static int count = 0;
    private static StringBuilder  builder = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        personA = Integer.parseInt(tokenizer.nextToken());
        personB = Integer.parseInt(tokenizer.nextToken());
        linked = new ArrayList[n + 1];
        IntStream.range(1, n + 1).forEach(index -> linked[index] = new ArrayList<>());
        isVisited = new boolean[n + 1];
        int m = Integer.parseInt(reader.readLine());
        while (m-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            linked[x].add(y);
            linked[y].add(x);
        }
        dfs(personA);
        if (builder.isEmpty()) writer.append("-1").close();
        else writer.append(builder).close();
    }
    private static void dfs(int people) {
        if (isVisited[people]) return;
        isVisited[people] = true;
        if (people == personB) {
            builder.append(count);
            return;
        }
        count++;
        linked[people].forEach(nextPeople -> dfs(nextPeople));
        count--;
    }
}
