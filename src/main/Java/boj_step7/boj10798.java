import java.io.*;

public class boj10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] list = new char[5][15];
        for (int i = 0; i < list.length; i++) {
            char[] c = reader.readLine().toCharArray();
            for (int j = 0; j < c.length; j++) list[i][j] = c[j];
        }
        for (int j = 0; j < 15; j++)
            for (int i = 0; i < list.length; i++)
                if (list[i][j] != 0)
                    writer.append(list[i][j]);
        writer.close();
    }
}