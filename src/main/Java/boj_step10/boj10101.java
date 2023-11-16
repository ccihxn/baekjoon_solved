import java.io.*;

public class boj10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a + b + c != 180) writer.append("Error").close();
        else {
            if(a == b && a == c) writer.append("Equilateral").close();
            else if (a == b || a == c || b == c) writer.append("Isosceles").close();
            else writer.append("Scalene").close();
        }
    }
}
