import java.io.*;
import java.util.HashSet;

public class boj11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = reader.readLine();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < line.length(); i++)
            for (int j = i + 1; j <= line.length(); j++)
                set.add(line.substring(i, j));
        writer.append(String.valueOf(set.size())).close();
    }
}