import java.io.*;
import java.util.Stack;

public class boj4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while (!(line = reader.readLine()).equals(".")) writer.append((isVps(line)) ? "yes\n" : "no\n");
        writer.close();
    }
    private static boolean isVps(String line) {
        Stack<Boolean> list = new Stack<>();
        for (char c: line.toCharArray())
            switch (c) {
                case ')': if (list.isEmpty() || !list.pop()) return false; break;
                case ']': if (list.isEmpty() || list.pop()) return false; break;
                case '(': list.push(true); break;
                case '[': list.push(false); break;
            }
        if (list.isEmpty()) return true;
        else return false;
    }
}