import java.io.*;
import java.util.Arrays;

public class boj1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(reader.readLine());
        double[] score = Arrays.stream(reader.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double maxScore = Arrays.stream(score).max().getAsDouble();
        int index = 0;
        for (double it: score) score[index++] = it / maxScore * 100;
        writer.append(String.valueOf(Arrays.stream(score).average().getAsDouble()));
        writer.close();
    }
}
