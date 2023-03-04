import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            String S = br.readLine();
            char k = br.readLine().trim().charAt(0);
 
            int out_ = solve(S, k);
            System.out.println(out_);
            
         }
 
         wr.close();
         br.close();
    }
    static int solve(String S, char k){
       // Write your code here
        int result = 0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==k)
            result++;
        }
        return result;
    
    }
}