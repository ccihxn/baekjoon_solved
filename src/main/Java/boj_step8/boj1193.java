import java.io.*;

public class boj1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i = 0; i < 10_000_000; i++) {
            if (n >= sum + 1 && n <= sum + i) {
                if (i % 2 == 0) {
                    writer.append((i - (sum + i - n)) + "/" + (1 + (sum + i - n)));
                    break;
                } else {
                    writer.append((1 + (sum + i - n)) + "/" + (i - (sum + i - n)));
                    break;
                }
            } else sum += i;
        }
        writer.close();
    }
}
