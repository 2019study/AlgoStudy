import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long min = input.nextLong();
		long max = input.nextLong();
		//boolean[] resultSet = new boolean[(int)(max-min+1)];//최대 1000001개 ㅇㅇ
		//int maxDecimal = (int) Math.sqrt(max);//1조 루트씌우면 100만임. ㅇㅇ			
		long count = 0;	
		for (long i = min; i < max + 1; i++) {
			for(long j =2;j*j<max+1;j++){
				if(i%((long)(j*j))==0){
					count++;
					break;
				}
				//
			}
		}
		System.out.println(max-min-count+1);
	}

}
