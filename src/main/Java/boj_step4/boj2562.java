import java.io.*;

public class boj2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = 9;
        int[] list = new int[size];
        for (int i = 0; i < size; i++) list[i] = Integer.parseInt(reader.readLine());
        int max = Integer.MIN_VALUE;
        int index = 1;
        int count = 0;
        for (int it: list) {
            if (it > max) {
                max = it;
                count = index;
            }
            index++;
        }
        writer.append(String.valueOf(max));
        writer.newLine();
        writer.append(String.valueOf(count));
        writer.close();
    }
}
