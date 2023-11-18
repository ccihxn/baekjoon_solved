import java.io.*;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        while (k-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            if (n == 0) stack.pop();
            else stack.push(n);
        }
        if (stack.isEmpty()) writer.append("0").close();
        else writer.append(String.valueOf(stack.stream().reduce(Integer::sum).get())).close();
    }
}