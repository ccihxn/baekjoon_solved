import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class boj2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Queue<Integer> cardSet = new LinkedList<>();
        for (int i = 1; i <= n; i++) cardSet.offer(i);
        while (cardSet.size() != 1) {
            cardSet.poll();
            cardSet.offer(cardSet.poll());
        }
        writer.append(String.valueOf(cardSet.poll())).close();
    }
}