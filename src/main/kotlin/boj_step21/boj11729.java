import java.io.*;

public class boj11729 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int k = (int) Math.pow(2, n) - 1;
        StringBuilder tmp = new StringBuilder(String.valueOf(k)).append("\n");
        hanoi(n, 1, 3, tmp);
        writer.append(tmp).close();
    }

    private static void hanoi(int n, int from, int to, StringBuilder tmp) throws IOException {
        if (n == 0) return;
        int spare = 6 - from - to;
        hanoi(n - 1, from, spare, tmp);
        tmp.append(from).append(" ").append(to).append("\n");
        hanoi(n - 1, spare, to, tmp);
    }
}