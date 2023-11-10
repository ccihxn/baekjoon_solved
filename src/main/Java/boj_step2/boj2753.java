import java.io.*;

public class boj2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int year = Integer.parseInt(reader.readLine());
        int isLeap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 1 : 0;
        writer.append(String.valueOf(isLeap));
        writer.close();
    }
}
