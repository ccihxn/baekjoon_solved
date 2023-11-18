import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            switch (tokenizer.nextToken()) {
                case "1": stack.push(Integer.parseInt(tokenizer.nextToken())); break;
                case "2": {
                    if (!stack.isEmpty()) writer.append(stack.pop() + "\n");
                    else writer.append("-1\n");
                } break;
                case "3": writer.append(stack.size() + "\n"); break;
                case "4": writer.append((stack.isEmpty()) ? "1\n" : "0\n"); break;
                case "5": {
                    if (!stack.isEmpty()) writer.append(stack.lastElement() + "\n");
                    else writer.append("-1\n");
                }
            }
        }
        writer.close();
    }
}
