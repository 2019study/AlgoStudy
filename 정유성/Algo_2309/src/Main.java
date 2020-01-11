import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      PriorityQueue<Integer> a = new PriorityQueue<Integer>();
      int arr[] = new int[9];
      int sum = 0;
      

      for (int n = 0; n < 9; n++) {
         int temp = input.nextInt();
         arr[n] = temp;
         sum = sum + temp;
      }
      loop:
      for(int n =0;n<9;n++) {
         for(int m=n+1;m<9;m++) {
            if(arr[n]+arr[m]+100==sum) {
               arr[n] = 0; arr[m]=0;
               break loop;
            }
         }
         
      }
      for (int n = 0; n < 9; n++) {
         if(arr[n]>0) {
            a.add(arr[n]);
         }
      }
      while(!a.isEmpty()) {
         System.out.println(a.poll());
      }
   }

}