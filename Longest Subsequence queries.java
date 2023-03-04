import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Map;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        LongestSubsequenceQueries solver = new LongestSubsequenceQueries();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }
 
    static class LongestSubsequenceQueries {
        final boolean isDevEnv = System.getenv().get("USERDOMAIN") != null
                && System.getenv().get("USERDOMAIN").equals("LAPTOP-DSSUKMC1");
        int N;
        int Q;
        long[] A;
        long[] K;
 
        public void fillInputParams(FastReader in) {
            N = in.nextInt();
            Q = in.nextInt();
            A = in.getLongArray(N);
            K = in.getLongArray(Q);
        }
 
        Object solveOptimised(FastReader in, StringBuilder sb) {
            Arrays.sort(A);
            for (int i = 1; i < N; ++i) A[i] += A[i - 1];
 
            for (long k : K) {
                int index = Arrays.binarySearch(A, k - 1);
                if (index < 0) index = -index - 1;
                while (index > 0 && index < N && A[index - 1] >= k) --index;
                while (index >= 0 && index < N && A[index] < k) ++index;
                sb.append(index).append("\n");
            }
            return sb.toString().trim();
        }
 
        Object solveBrute(FastReader in, StringBuilder sb) {
            if (!isDevEnv) return null;
            return null;
        }
 
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            // out.print("Case #" + testNumber + ": ");
 
            fillInputParams(in);
            Object outOptimised = solveOptimised(in, new StringBuilder());
            Object outBrute = solveBrute(in, new StringBuilder());
            if (outBrute == null) {
                out.println(outOptimised);
            } else if (outBrute.toString().equals(outOptimised.toString())) {
                System.err.println(testNumber + ". OK Checked");
            } else {
                // print input params
                System.err.println("Actual = " + outOptimised);
                System.err.println("Expected = " + outBrute);
                System.err.println();
                throw new ArithmeticException();
            }
        }
 
    }
 
    static class FastReader {
        static final int BUFSIZE = 1 << 20;
        static byte[] buf;
        static int index;
        static int total;
        static InputStream in;
 
        public FastReader(InputStream is) {
            try {
                in = is;
                buf = new byte[BUFSIZE];
            } catch (Exception e) {
            }
        }
 
        private int scan() {
            try {
                if (index >= total) {
                    index = 0;
                    total = in.read(buf);
                    if (total <= 0)
                        return -1;
                }
                return buf[index++];
            } catch (Exception | Error e) {
                System.err.println(e.getMessage());
                return 13 / 0;
            }
        }
 
        public String next() {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan())
                sb.append((char) c);
            return sb.toString();
        }
 
        public int nextInt() {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+')
                c = scan();
            for (; c >= '0' && c <= '9'; c = scan())
                val = (val << 3) + (val << 1) + (c & 15);
            return neg ? -val : val;
        }
 
        public long nextLong() {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+')
                c = scan();
            for (; c >= '0' && c <= '9'; c = scan())
                val = (val << 3) + (val << 1) + (c & 15);
            return neg ? -val : val;
        }
 
        public long[] getLongArray(int size) {
            long[] ar = new long[size];
            for (int i = 0; i < size; ++i) ar[i] = nextLong();
            return ar;
        }
 
    }
}
 