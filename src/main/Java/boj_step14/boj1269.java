import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int aSize = Integer.parseInt(tokenizer.nextToken());
        int bSize = Integer.parseInt(tokenizer.nextToken());
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        tokenizer = new StringTokenizer(reader.readLine());
        while (aSize-- > 0) a.add(Integer.parseInt(tokenizer.nextToken()));
        tokenizer = new StringTokenizer(reader.readLine());
        while (bSize-- > 0) b.add(Integer.parseInt(tokenizer.nextToken()));
        HashSet<Integer> retainAB = new HashSet<>(a);
        retainAB.retainAll(b);
        a.addAll(b);
        a.removeAll(retainAB);
        writer.append(String.valueOf(a.size())).close();
    }
}
