import java.io.*;

public class boj2447 {
    static char[][] starArray;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        starArray = new char[n][n];
        stars(0, 0, n, false);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) writer.append(starArray[i][j]);
            writer.append("\n");
        }
        writer.close();
    }
    private static void stars(int x, int y, int n, boolean isBlanked) {
        if (isBlanked) {
            for (int i = x; i < x + n; i++)
                for (int j = y; j < y + n; j++) starArray[i][j] = ' ';
            return;
        }
        if (n == 1) {
            starArray[x][y] = '*';
            return;
        }
        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                if (count == 5) stars(i, j, size, true);
                else stars(i, j, size, false);
            }
        }
    }
}
