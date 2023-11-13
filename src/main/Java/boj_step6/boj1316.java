import java.io.*;
import java.util.LinkedList;

public class boj1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int count = 0;
        while (n-- > 0) {
            int tmp = 0;
            LinkedList<Character> list = new LinkedList<>();
            char[] line = reader.readLine().toCharArray();
            list.add(line[0]);
            for (int i = 1; i < line.length; i++) {
                if (line[i] != line[i - 1]) {
                    if (list.contains(line[i])) {
                        tmp++;
                        break;
                    } else list.add(line[i]);
                }
            }
            if (tmp == 0) count++;
        }
        writer.append(String.valueOf(count));
        writer.close();
    }
}
