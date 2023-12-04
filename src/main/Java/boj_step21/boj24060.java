import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj24060 {
    static int[] tmp = new int[500_000];
    static int count = 0;
    static int result = -1;
    static int temp = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        temp = k;
        int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        mergeSort(list, 0, n - 1);
        writer.append(String.valueOf(result)).close();
    }

    private static void mergeSort(int[] list, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(list, p, q);
            mergeSort(list , q + 1, r);
            merge(list, p, q, r);
        }
    }
    private static void merge(int[] list, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;
        while (i <= q && j <= r) {
            if (list[i] <= list[j]) tmp[t++] = list[i++];
            else tmp[t++] = list[j++];
        }
        while (i <= q) tmp[t++] = list[i++];
        while (j <= r) tmp[t++] = list[j++];
        i = p;
        t = 0;
        while (i <= r) {
            list[i++] = tmp[t++];
            if (++count == temp) result = tmp[t - 1];
        }
    }
}