import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            switch (tokenizer.nextToken()) {
                case "1": deque.push(Integer.parseInt(tokenizer.nextToken())); break;
                case "2": deque.offer(Integer.parseInt(tokenizer.nextToken())); break;
                case "3":
                    if (deque.isEmpty()) writer.append("-1\n");
                    else writer.append(deque.poll() + "\n"); break;
                case "4":
                    if (deque.isEmpty()) writer.append("-1\n");
                    else writer.append(deque.pollLast() + "\n"); break;
                case "5": writer.append(deque.size() + "\n"); break;
                case "6": writer.append((deque.isEmpty()) ? "1\n" : "0\n"); break;
                case "7":
                    if (deque.isEmpty()) writer.append("-1\n");
                    else writer.append(deque.peek() + "\n"); break;
                case "8":
                    if (deque.isEmpty()) writer.append("-1\n");
                    else writer.append(deque.peekLast() + "\n"); break;
            }
        }
        writer.close();
    }
}
