import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         int start = Integer.parseInt(br.readLine().trim());
         int finish = Integer.parseInt(br.readLine().trim());
         String[] arr_Ticket_cost = br.readLine().split(" ");
         int[] Ticket_cost = new int[N];
         for(int i_Ticket_cost = 0; i_Ticket_cost < arr_Ticket_cost.length; i_Ticket_cost++)
         {
         	Ticket_cost[i_Ticket_cost] = Integer.parseInt(arr_Ticket_cost[i_Ticket_cost]);
         }
 
         long out_ = solve(N, start, finish, Ticket_cost);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static long solve(int N, int start, int finish, int[] Ticket_cost){
       // Write your code here
        long result = 0,r1=0;
        if(start>finish){
            start = finish+start;
            finish=start-finish;
            start = start- finish;
        }
        for(int i=start-1; i<finish-1;i++){
            result +=Ticket_cost[i];
        }
        boolean flag = true;
        for(int j=finish-1;j>=start-1 && start==1;j--){
            if (flag){
                j=N-1;
                flag = false;
            }
            r1+=Ticket_cost[j];
            if(j==finish-1){
                break;
            }
        }
        result = (r1>result || r1==0)?result:r1;
        return result;
    
    }
}