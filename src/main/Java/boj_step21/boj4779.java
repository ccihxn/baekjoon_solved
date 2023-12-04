import java.io.*;

public class boj4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            while (true) {
                String s = "-";
                int n = Integer.parseInt(reader.readLine());
                if (n == 0) writer.append(s + "\n");
                else writer.append(hyphens(s, n) + "\n").flush();
            }
        } catch (Exception e) { e.getMessage(); }
    }
    private static String hyphens(String s,  int n) {
        if (n == 0) return s;
        String temp = "";
        for (int i = 0; i < 3; i++) {
            if (i == 1) temp += s.replace("-", " ");
            else temp += s;
        }
        return hyphens(temp, n - 1);
    }
}
