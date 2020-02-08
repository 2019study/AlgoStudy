import java.util.Scanner;
public class Main {
	public static long cal(long a, long b,long s){
		if(a+b==s){
			return -1;
		}
		else if(a+b>s){
			return 0;
		}
		else{
			long alpha = cal(a+b,b,s);
			if(alpha==-1)
				return -1;
			long beta =  cal(a,a+b,s);
			if(beta==-1)
				return -1;
			else
				return 0;
		}
		
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long A = input.nextLong();
		long B = input.nextLong();
		long s = input.nextLong();
		long a = cal(A,B,s);
		if(a==-1)
			System.out.println("YES");
		else if(a==0)
			System.out.println("NO");
	}

}
