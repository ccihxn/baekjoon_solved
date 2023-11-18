import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        Deque<Balloon> balloons = new ArrayDeque<>();
        for (int i = 0; i < n; i++) balloons.offer(new Balloon(i + 1, Integer.parseInt(tokenizer.nextToken())));
        while (!balloons.isEmpty()) {
            Balloon tmp = balloons.pop();
            writer.append(tmp.index + " ");
            if (!balloons.isEmpty()) {
                if (tmp.note > 0) for (int i = 0; i < tmp.note - 1; i++) balloons.offer(balloons.pop());
                else for (int i = 0; i < Math.abs(tmp.note); i++) balloons.push(balloons.pollLast());
            }
        }
        writer.close();
    }

    private static class Balloon {
        int index;
        int note;

        Balloon (int index, int note) {
            this.index = index;
            this.note = note;
        }
    }
}