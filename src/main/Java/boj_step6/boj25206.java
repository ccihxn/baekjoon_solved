import java.io.*;
import java.util.StringTokenizer;

public class boj25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 20;
        double sumGrade = 0.;
        double sumScore = 0.;
        while (n-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            tokenizer.nextToken();
            double grade = Double.parseDouble(tokenizer.nextToken());
            double score;
            String scoreE = tokenizer.nextToken();
            switch (scoreE) {
                case "A+" : score = 4.5; break;
                case "A0" : score = 4.0; break;
                case "B+" : score = 3.5; break;
                case "B0" : score = 3.0; break;
                case "C+" : score = 2.5; break;
                case "C0" : score = 2.0; break;
                case "D+" : score = 1.5; break;
                case "D0" : score = 1.0; break;
                default: score = 0.;
            }
            if (!scoreE.equals("P")) {
                sumGrade += grade;
                sumScore += grade * score;
            }
        }
        writer.append(String.format("%.6f", sumScore / sumGrade));
        writer.close();
    }

}
