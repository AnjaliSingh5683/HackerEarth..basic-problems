import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
 
         int out_ = Consistent(N);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static int mod = 1000000007; 
    static int Consistent(int N){ 
        // Write your code here 
        int[]dp = new int[N+1];     
        int even = 0,odd=0;     
        for(int i=0;i<N;i++){      
            if(i%2==0){      
                dp[i] = (even+1)%mod;      
                odd = (odd+dp[i])%mod;      
            }
            else{      
                dp[i] = (odd+1)%mod;      
                even = (even+dp[i])%mod;      
            }          
        }     
        int sum = 0;     
        for(int d:dp)
            sum=(sum+d)%mod;     
        return sum;
    }
}