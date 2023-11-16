import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

public class boj1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        while (n-- > 0) set.add(reader.readLine());
        List<String> list = new ArrayList<>(set);
        list.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        for (String it: list) writer.append(it + "\n");
        writer.close();
    }
}