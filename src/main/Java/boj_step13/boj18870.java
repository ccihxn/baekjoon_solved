import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class boj18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine()), value = 0;
        int[] vertical = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sortedVertical = Arrays.copyOf(vertical, vertical.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(sortedVertical);
        for (int key : sortedVertical)
            if (!map.containsKey(key)) map.put(key, value++);
        for (int it : vertical) writer.append(map.get(it) + " ");
        writer.close();
    }
}