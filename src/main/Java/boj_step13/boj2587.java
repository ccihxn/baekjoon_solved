import java.io.*;
import java.util.Arrays;

public class boj2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) list[i] = Integer.parseInt(reader.readLine());
        list = Arrays.stream(list).sorted().toArray();
        writer.append(String.format("%.0f", Arrays.stream(list).average().getAsDouble()));
        writer.newLine();
        writer.append(String.valueOf(list[2])).close();
    }
}