import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class boj20920 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        HashMap<String, Integer> notes = new HashMap<>();
        while (n-- > 0) {
            String word = reader.readLine();
            if (word.length() >= m) {
                if (notes.containsKey(word)) notes.put(word, notes.get(word) + 1);
                else notes.put(word, 1);
            }
        }
        Stream<Map.Entry<String, Integer>> result = notes.entrySet().stream().sorted((x, y) -> {
            if (x.getValue() != y.getValue()) return y.getValue().compareTo(x.getValue());
            else if (y.getKey().length() != x.getKey().length()) return y.getKey().length() - x.getKey().length();
            else return x.getKey().compareTo(y.getKey());
        });
        StringBuilder tmp = new StringBuilder();
        result.forEach(x -> tmp.append(x.getKey() + "\n"));
        writer.append(tmp);
        writer.close();
    }
}
