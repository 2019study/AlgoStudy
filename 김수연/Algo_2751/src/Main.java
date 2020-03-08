import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < n; i++)
            answer.add(Integer.parseInt(br.readLine()));
        br.close();

        Collections.sort(answer);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++)
            bw.write(answer.get(i) + "\n");
        bw.flush();
    }
}