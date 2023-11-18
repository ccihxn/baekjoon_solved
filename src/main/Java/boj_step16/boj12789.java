import java.io.*;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class boj12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int count = 1;
        Stack<Integer> line = Arrays.stream(reader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(Stack::new));
        Stack<Integer> spare = new Stack<>();
        while (true) {
            if (line.isEmpty() && spare.isEmpty()) {
                writer.append("Nice");
                break;
            }
            if (spare.isEmpty()) {
                if (line.firstElement() != count) spare.push(line.firstElement());
                else count++;
                line.removeElementAt(0);
            } else if(line.isEmpty()) {
                if (spare.lastElement() != count) {
                    writer.append("Sad");
                    break;
                }
                spare.pop();
                count++;
            } else {
                if (line.firstElement() != count && spare.lastElement() != count) {
                    spare.add(line.firstElement());
                    line.removeElementAt(0);
                } else if (line.firstElement() == count) {
                    line.removeElementAt(0);
                    count++;
                } else if (spare.lastElement() == count) {
                    spare.pop();
                    count++;
                }
            }
        }
        writer.close();
    }
}
