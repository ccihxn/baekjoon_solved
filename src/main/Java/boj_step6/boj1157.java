import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class boj1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] chars = reader.readLine().toUpperCase().toCharArray();
        HashMap map = new HashMap<Character, Integer>();
        for (char c: chars) {
            if (map.containsKey(c)) map.put(c, (int)map.get(c) + 1);
            else map.put(c, 1);
        }
        int maxValue = (int) Collections.max(map.values());
        Optional<Map.Entry<Character, Integer>> maxEntry = map.entrySet().stream().max(Map.Entry.comparingByValue());
        long count = map.values().stream().filter( value -> (int)value == maxValue ).count();
        if (count > 1) writer.append("?");
        else writer.append(String.valueOf(maxEntry.get().getKey()));
        writer.close();
    }
}