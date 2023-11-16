import java.io.*;
import java.util.*;

public class boj7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        HashSet<String> list = new HashSet<>();
        while(n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String name = tokenizer.nextToken();
            String clock = tokenizer.nextToken();
            if (clock.equals("enter")) list.add(name);
            else if (clock.equals("leave")) list.remove(name);
        }
        List<String> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList, Comparator.reverseOrder());
        for (String name: sortedList) writer.append(name + "\n");
        writer.close();
    }
}
