import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String S = br.readLine();
         int K = Integer.parseInt(br.readLine().trim());
 
         int out_ = solve(S, K);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static int solve(String s, int k){
       // Write your code here
        int result = 0;
        HashMap<Character,Integer> hmp = new HashMap<Character,Integer>();
        int cs = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(hmp.containsKey(ch)){
                int index = hmp.get(ch);
                if(index<(i-k+1)){
                    hmp.put(ch,i);
                }
                else{
                    result++;
                }
            }
            else{
                hmp.put(ch,i);
            }
        }
 
        return result;
    
    }
}