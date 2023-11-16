import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class boj1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] line = reader.readLine().toCharArray();
        Integer[] list = new Integer[line.length];
        for (int i = 0; i < line.length; i++) list[i] = Character.getNumericValue(line[i]);
        Arrays.sort(list, Collections.reverseOrder());
        for (int it: list) writer.append(String.valueOf(it));
        writer.close();
    }
}
