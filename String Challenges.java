import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        // FileInputStream fileInputStream = new FileInputStream("string.txt");
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            String S = br.readLine();
 
            String out_ = solve(N, K, S);
            System.out.println(out_);
 
        }
 
        wr.close();
        br.close();
    }
 
    static String solve(int N, int K, String S) {
        // write your code here
        K = N + K;
        String result = "";
        int f = -1;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < K; j++) {
                if (f == -1) {
                    f = i;
                } else {
                    if (S.charAt(j % i) < S.charAt(j % f)) {
                        f = i;
                        break;
                    }
                    else if(S.charAt(j % i) > S.charAt(j % f)){
                        break;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String r = S.substring(0, f);
        for (int i = 0; i <= K / f; i++) {
            sb.append(r);
        }
 
        return sb.substring(0, K);
 
    }
}