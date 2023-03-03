import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_workload = br.readLine().split(" ");
         int[] workload = new int[N];
         for(int i_workload = 0; i_workload < arr_workload.length; i_workload++)
         {
         	workload[i_workload] = Integer.parseInt(arr_workload[i_workload]);
         }
 
         int out_ = solve(N, workload);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static int solve(int N, int[] w){
       // Write your code here
        int result = 0,x=0;
        for(int i=0;i<N;i++){
            if(w[i]>6){
                x++;
            }
            else{
                if(x>result){
                    result=x;
                }
                x=0;
            }
        }
 
        return result;
    
    }
}