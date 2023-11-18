import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class boj24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        reader.readLine();
        Queue<Integer> isQueuestack = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(LinkedList::new));
        Deque<Integer> result = new ArrayDeque<>();
        Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(it -> { if (isQueuestack.poll() == 0) result.push(it); });
        int m = Integer.parseInt(reader.readLine());
        Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(it -> result.offer(it));
        StringBuilder tmp = new StringBuilder();
        IntStream.range(0, m).forEach(it -> tmp.append(result.poll() + " "));
        writer.append(tmp).close();
    }
}