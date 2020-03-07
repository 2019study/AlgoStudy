import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        br.close();

        int answer = 1;
        if (n > 1) {
            while (n != 1) {
                answer = answer * n;
                n--;
            }
        }

        System.out.println(answer);
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(answer + "\n");
//        bw.flush();
//        bw.close();
    }
}