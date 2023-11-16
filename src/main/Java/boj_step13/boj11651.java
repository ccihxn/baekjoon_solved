import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        Node[] list = new Node[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            list[i] = new Node(x, y);
        }
        Arrays.sort(list, Comparator.comparing((Node node) -> node.getY()).thenComparingInt((Node node) -> node.getX()) );
        for (int i = 0; i < n; i++) {
            writer.append(list[i].getX() + " " + list[i].getY());
            writer.newLine();
        }
        writer.close();
    }
    private static class Node {
        int x, y;
        Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() { return x; }
        public int getY() { return y; }
    }
}