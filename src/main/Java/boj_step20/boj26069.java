import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj26069 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        HashSet<String> list = new HashSet<>();
        int count = 0;
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String a = tokenizer.nextToken();
            String b = tokenizer.nextToken();
            if ((a.equals("ChongChong") || b.equals("ChongChong")) && !list.contains("ChongChong")) {
                list.add(a);
                list.add(b);
                count += list.size();
            }
            if (list.contains(a) && !list.contains(b)) { list.add(b); count++; }
            else if (list.contains(b) && !list.contains(a)) { list.add(a); count++; }
        }
        writer.append(String.valueOf(count)).close();
    }
}