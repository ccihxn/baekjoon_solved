import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class boj1068 {private static ArrayList<Integer>[] linked;
    private static int rootNode;
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        linked = new ArrayList[n];
        IntStream.range(0, n).forEach(x -> linked[x] = new ArrayList<>());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        IntStream.range(0, tokenizer.countTokens()).forEach(x -> {
            int tmp = Integer.parseInt(tokenizer.nextToken());
            if (tmp == -1) rootNode = x;
            else linked[tmp].add(x);
        });
        int removeKey = Integer.parseInt(reader.readLine());
        if (removeKey == rootNode) writer.append("0").close();
        else {
            for (int i = 0; i < n; i++)
                if (linked[i].contains(removeKey)) linked[i] = linked[i].stream().filter(x -> (x != removeKey)).collect(Collectors.toCollection(ArrayList::new));
            if (linked[rootNode].isEmpty()) writer.append("1").close();
            else {
                dfs(rootNode);
                writer.append(String.valueOf(count)).close();
            }
        }
    }
    private static void dfs(int n) {
        linked[n].forEach(x -> {
            if (linked[x].isEmpty()) count++;
            else dfs(x);
        });
    }
}
