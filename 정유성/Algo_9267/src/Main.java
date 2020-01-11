import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);

      int a, b, s;
      a = input.nextInt();
      b = input.nextInt();
      s = input.nextInt();
      int temp;
      boolean answer = false;      
      loop:
      for (int n = 1; n < (s / a)+1; n++) {
         for (int m = 1; m < (s / b)+1; m++) {
            temp = n*a+m*b;
            if(temp==s) {
               answer = true;
               break loop;
            }
            else if(temp>s) {
               break;
            }
         }
      }
      if(answer)
         System.out.println("YES");
      else
         System.out.println("NO");
   }

}