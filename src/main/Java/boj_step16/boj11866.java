import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        writer.append(josephus(n, k)).close();
    }
    private static String josephus(int n ,int k) {
        Queue<Integer> list = new LinkedList<>();
        StringBuilder temp = new StringBuilder("<");
        for (int i = 1; i <= n; i++) list.offer(i);
        while (list.size() != 1) {
            for (int i = 1; i < k; i++) list.offer(list.poll());
            temp.append(list.poll() + ", ");
        }
        temp.append(list.poll() + ">");
        return temp.toString();
    }
}