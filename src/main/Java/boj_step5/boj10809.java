import java.io.*;
import java.util.Arrays;

public class boj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);
        char[] line = reader.readLine().toCharArray();
        int index = line.length;
        while (index-- > 0) alphabets[line[index] - 'a'] = index;
        for (int it: alphabets) writer.append(it + " ");
        writer.close();
    }
}