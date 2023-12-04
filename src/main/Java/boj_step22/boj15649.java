import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj15649 {
    private static int n;
    private static int m;
    private static Stack<Integer> result;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        result = new Stack<>();
        visited = new boolean[n + 1];
        StringBuilder builder = new StringBuilder();
        dfs(0, builder);
        writer.append(builder).close();
    }
    private static void dfs(int num, StringBuilder builder) {
        if (num == m) {
            result.forEach(x -> builder.append(x).append(' '));
            builder.append("\n");
            return;
        }
        for (int i = 1; i <= n; i++)
            if (!visited[i]) {
                visited[i] = true;
                result.push(i);
                dfs(num + 1, builder);
                visited[i] = false;
                result.pop();
            }
    }
}
