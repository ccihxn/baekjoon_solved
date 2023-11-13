import java.io.*;

public class boj3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 10;
        boolean[] mod = new boolean[42];
        while (count-- > 0) {
            int dividend = Integer.parseInt(reader.readLine());
            mod[dividend % 42] = true;
        }
        count = 0;
        for (boolean it: mod) if (it) count++;
        writer.append(String.valueOf(count));
        writer.close();
    }
}