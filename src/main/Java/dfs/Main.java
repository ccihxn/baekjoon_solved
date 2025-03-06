import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        Long n = Long.parseLong(reader.readLine()), res = 1L;

        for (int i = 1; i <= n; i++)
            res *= i;

        writer.append(String.valueOf(res)).close();
    }
}