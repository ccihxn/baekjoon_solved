import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class boj9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        while ((n = Integer.parseInt(reader.readLine())) != -1) {
            Queue<Integer> factors = new LinkedList<>();
            for (int i = 1; i <= n / 2; i++) if (n % i == 0) factors.add(i);
            if (n == factors.stream().mapToInt(Integer::intValue).sum()) {
                writer.append(n + " = " + factors.poll());
                while (!factors.isEmpty()) writer.append(" + " + factors.poll());
            } else writer.append(n + " is NOT perfect.");
            writer.newLine();
        }
        writer.close();
    }
}