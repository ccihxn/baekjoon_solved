import java.io.*;
import java.util.LinkedList;

public class boj2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int tmp = 6;
        int count = 1;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(count);
            if (list.get(i) >= n) {
                writer.append(String.valueOf(i + 1));
                writer.close();
                return;
            }
            count += tmp;
            tmp += 6;
        }
    }
}
