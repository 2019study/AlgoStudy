import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int count = 1;
		String[] arr = new String[N];
		char[][] coordinate = new char[N][M];
		for (int i = 0; i < N; i++)
			arr[i] = input.next();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				coordinate[i][j] = arr[i].charAt(j);
		}

		Queue<Integer> LastPosition = new LinkedList<Integer>();
		int call=0;
		LastPosition.add(0);
		while (coordinate[N - 1][M - 1] != '2') {
			
			int size = LastPosition.size();
			
			// while (!LastPosition.isEmpty()) {
			for (int i = 0; i < size; i++) {
				
				int k = LastPosition.poll();
				int FN = k / 100;
				int FM = k % 100;
				try {
					if (coordinate[FN + 1][FM] == '1') {
						coordinate[FN + 1][FM] = '2';
						LastPosition.add(k + 100);
					}
				} catch (Exception e) {

				}
				try {
					if (coordinate[FN - 1][FM] == '1') {
						coordinate[FN - 1][FM] = '2';
						LastPosition.add(k - 100);
					}
					
				} catch (Exception e) {

				}
				try {
					if (coordinate[FN][FM + 1] == '1') {
						coordinate[FN][FM + 1] = '2';
						LastPosition.add(k + 1);
					}
				} catch (Exception e) {

				}
				try {
					if (coordinate[FN][FM - 1] == '1') {
						coordinate[FN][FM - 1] = '2';
						LastPosition.add(k - 1);
					}
				} catch (Exception e) {

				}

				
			}
			count++;
			
		}
		System.out.println(count);
	}

}