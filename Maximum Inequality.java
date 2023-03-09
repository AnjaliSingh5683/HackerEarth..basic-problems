import java.io.*;
import java.util.*;
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine();
 
            int out_ = solve(N, S);
            System.out.println(out_);
            
         }
 
         br.close();
    }
    static int solve(int N, String s){
        int ans = 0;
         int prev = 0;
         if(s.charAt(0)=='0') prev = 0;
         else prev = 1;
         boolean ok = false;
         int nprev = -1;
        for(int i = 1; i < N; i++) {
            int cur = 0;
           if(s.charAt(i) == '0') cur = 0;
           else cur = 1;  
           if(prev!=cur) {ans++; prev = cur; continue;}
           
           if(!ok) {nprev = cur; ok = true;}
           else{
             if(cur!=nprev) {ans++; nprev = cur;}
           }
        }
 
        return ans;
    
    }
}