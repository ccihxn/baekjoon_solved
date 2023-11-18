import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            switch (tokenizer.nextToken()) {
                case "push": queue.offer(Integer.parseInt(tokenizer.nextToken())); break;
                case "pop":
                    if (queue.isEmpty()) writer.append("-1\n");
                    else writer.append(queue.poll() + "\n"); break;
                case "size": writer.append(queue.size() + "\n"); break;
                case "empty": writer.append((queue.isEmpty()) ? "1\n" : "0\n"); break;
                case "front":
                    if (queue.isEmpty()) writer.append("-1\n");
                    else writer.append(queue.peek() + "\n"); break;
                case "back":
                    if (queue.isEmpty()) writer.append("-1\n");
                    else writer.append(queue.peekLast() + "\n");
            }
        }
        writer.close();
    }
}