import java.io.*;

public class boj5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int capacity = 30;
        boolean[] register = new boolean[capacity];
        capacity -= 2;
        while (capacity-- > 0) {
            int number = Integer.parseInt(reader.readLine());
            register[number - 1] = true;
        }
        for (int i = 0; i < register.length; i++)
            if (!register[i]) {
                writer.append(String.valueOf(i + 1));
                writer.newLine();
            }
        writer.close();
    }
}
