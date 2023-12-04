import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj15652 {
    private static int n = 0;
    private static int m = 0;
    private static Stack<Integer> result = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        StringBuilder builder = new StringBuilder();
        dfs(1, 0, builder);
        writer.append(builder).close();
    }
    private static void dfs(int tmp, int num, StringBuilder builder) {
        if (num == m) {
            result.forEach(x -> builder.append(x).append(' '));
            builder.append('\n');
            return;
        }
        for (int i = tmp; i <= n; i++) {
            result.push(i);
            dfs(i, num + 1, builder);
            result.pop();
        }
    }
}
