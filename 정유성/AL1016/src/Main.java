import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long min = input.nextLong();
		long max = input.nextLong();
		//boolean[] resultSet = new boolean[(int)(max-min+1)];//최대 1000001개 ㅇㅇ
		int maxDecimal = (int) Math.sqrt(max);//1조 루트씌우면 100만임. ㅇㅇ			
		int count = 0;	
		for (long i = min; i < max + 1; i++) {
			for(int j =2;j<maxDecimal+1;j++){
				if(i%((long)(j*j))==0)
					count++;
			}
		}
		System.out.println(max-min-(long)count+1);
	}

}
