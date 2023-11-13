import java.io.*;

public class boj5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] dial = { 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10 };
        char[] line = reader.readLine().toCharArray();
        int time = 0;
        for (char c: line) time += dial[c - 'A'];
        writer.append(String.valueOf(time));
        writer.close();
    }
}