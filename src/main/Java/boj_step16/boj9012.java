import java.io.*;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) writer.append((isVpn(reader.readLine()) ? "YES\n" : "NO\n"));
        writer.close();
    }
    private static boolean isVpn (String s) {
        Stack<Character> vpn = new Stack<>();
        for (char c: s.toCharArray()) {
            switch (c) {
                case '(': vpn.push('('); break;
                case ')': {
                    if (vpn.isEmpty()) return false;
                    else vpn.pop();
                } break;
            }
        }
        if (vpn.isEmpty()) return true;
        else return false;
    }
}