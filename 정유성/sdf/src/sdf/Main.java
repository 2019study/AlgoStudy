package sdf;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        //min 과 max 를 포함한 사이부분
        boolean[] cache = new boolean[(int)(max - min + 1)];
        //2의 제곱수인 4부터 max보다 작은 수 까지 제곱수를 반복문을 통해 구해줌
        for(long i = 2; i * i <= max; i++){
            long power = i * i;
            //min보다 큰 위에서 구한 제곱수의 시작값(몫)을 start로 지정
            long start = min % power == 0 ? min / power : (min / power) + 1;
            for(long j = start; power * j <= max; j++){
                cache[(int)((j * power) - min)] = true;
            }
        }
        int count = 0;
        //min 과 max 를 포함한 사이부분에 제곱ㄴㄴ수가 얼마나 있는지 구해줌
        for(int i = 0; i <= max - min; i++){
            if(!cache[i]){
                count++;
            }
        }
        bw.write(count + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}