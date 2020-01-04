package week2;

import java.util.*;
public class printerQ {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      int sc = input.nextInt();
      int[] output = new int[sc];
      
      Deque<Integer> data = new LinkedList<Integer>();
      PriorityQueue<Integer> prior = new PriorityQueue<Integer>(Collections.reverseOrder());
      
      for (int i = 0; i < sc; i++) {
         int N = input.nextInt();
         int M = input.nextInt();

         for (int j = 0; j < N; j++) {
            int element = input.nextInt();
            data.add(element);
            prior.add(element);
         }
         int cnt = 1;
         for (int j = 0; !data.isEmpty()&&M>-1; j++) {
            int currentHigh = prior.peek();
            if(data.peek()==currentHigh) {
               prior.poll();
               data.pop();
               if(M==0) {
                  output[i] = cnt;
               }
               M--;
               cnt++;
            }
            else {
               if(M==0) 
                  M=data.size()-1;
               else 
                  M--;
               data.addLast(data.pollFirst());
            }
         }
      }
      for(int i=0;i<output.length;i++)
         System.out.println(output[i]);
   }

}