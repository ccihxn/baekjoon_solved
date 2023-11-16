import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(reader.readLine());
        int id = 1;
        ArrayList<MemberList> list = new ArrayList<>();
        while(id <= n) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            list.add(new MemberList(id++, Integer.parseInt(tokenizer.nextToken()), tokenizer.nextToken()));
        }
        list.sort(Comparator.comparingInt(MemberList::getAge).thenComparingInt(MemberList::getId));
        for (MemberList it: list) {
            writer.append(it.getAge() + " " + it.getName());
            writer.newLine();
        }
        writer.close();
    }
    private static class MemberList {
        int id, age;
        String name;
        MemberList (int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }
        int getId() { return id; }
        int getAge() { return age; }
        String getName() { return name; }
    }
}
