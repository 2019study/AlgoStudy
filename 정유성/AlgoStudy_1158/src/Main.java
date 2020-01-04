import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static int n=input.nextInt(); static int m=input.nextInt();
    static int data[]= new int[n];
    static int x=0;static int a=0;
    public static void out(){
        int count=0;
        for(int i=x;;i++) {
            if(data[i]==0) count++;                
            if (count==m) {
                if(a==n-1) {
                    System.out.print((i+1)+">");
                    return;
                }
                System.out.print((i+1)+", ");
                data[i]=1;
                x=i;
                a++;
                return;
            }
            if(i==(n-1))
            	i=-1;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("<");
        for(int i=0;i<n;i++) {
            out();
        }
    }
}