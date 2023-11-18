import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class boj2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int[] list = new int[n];
        int[] count = new int[8001];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(reader.readLine());
            count[list[i] + 4000]++;
        }
        Arrays.sort(list);
        int maxCount = Arrays.stream(count).max().getAsInt();
        int maxCountResult = IntStream.range(0, count.length).filter(i -> count[i] == maxCount).findFirst().getAsInt() - 4000;
        if (IntStream.range(0, count.length).filter(i -> count[i] == maxCount).count() > 1) {
            maxCountResult = IntStream.range(0, count.length).filter(i -> count[i] == maxCount).skip(1).findFirst().getAsInt() - 4000;
        }
        writer.append(String.valueOf(Math.round(Arrays.stream(list).average().getAsDouble()))).append("\n");
        writer.append(String.valueOf(list[n / 2])).append("\n");
        writer.append(String.valueOf(maxCountResult)).append("\n");
        writer.append(String.valueOf(list[n - 1] - list[0])).close();
    }
}