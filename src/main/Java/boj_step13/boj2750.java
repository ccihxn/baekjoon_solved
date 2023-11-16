import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class boj2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (n-- > 0) list.add(Integer.parseInt(reader.readLine()));
        Collections.sort(list);
        for (int i: list) writer.append(i + "\n");
        writer.close();
    }
}