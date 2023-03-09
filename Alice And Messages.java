import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] A = new String[N];
         A = br.readLine().split(" ");
        
         
        //  for(int i=0; i<A.length; i++) {
        //      System.out.println(A[i]);
        //  }
 
         int out_ = findMessages(N, A);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static int findMessages(int N, String[] A){
       // Write your code here
         HashSet<String> hs = new HashSet<>();
 
        for(int j = 0; j < A.length; j++){
            char[] chr = A[j].toCharArray();
 
            for( int i = 0; i < chr.length; i++){
                chr[i] = (char) (122 - (chr[i] - 97));
            }
 
            
            if(!hs.contains(new String(chr)))
                hs.add(A[j]);
 
        }
        return hs.size();
    
    }
}