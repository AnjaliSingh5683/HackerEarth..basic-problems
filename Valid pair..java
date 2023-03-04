import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_wealth = br.readLine().split(" ");
         long[] wealth = new long[N];
         for(int i_wealth = 0; i_wealth < arr_wealth.length; i_wealth++)
         {
         	wealth[i_wealth] = Long.parseLong(arr_wealth[i_wealth]);
         }
 
         int out_ = solve(N, wealth);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static int solve(int N, long[] wealth){
       // Write your code here
        int result = 0;
 
        long[] powOf3s = new long[21];
        powOf3s[0] = 1l;
 
        for(int i=1; i<=20; i++) {
            powOf3s[i] = 3l * powOf3s[i-1];
        }
 
        Map<Long,Integer> map = new HashMap<>(N);
 
        for(int i=0; i<N; i++) {
            if(!map.containsKey(wealth[i])) {
                map.put(wealth[i],1);
            } else {
                map.put(wealth[i], map.get(wealth[i]) + 1);
            }
        }
 
        Set<Pair> set = new HashSet<>();
 
        for(Map.Entry<Long,Integer> entry: map.entrySet()) {
            for(int i=0; i<=20; i++) {
                long key = powOf3s[i] - entry.getKey();
                if(map.containsKey(key)) {
                    Pair p = new Pair(entry.getKey(), key);
 
                    if(!set.contains(p)) {
                        set.add(p);
                        result += entry.getValue() * map.get(key);
                    }
                }
            }
        }
 
        return result;
    
    }
 
    private static class Pair{
        long a,b;
 
        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }
 
        @Override
        public boolean equals(Object o) {
            if(o == null) {
                return false;
            }
 
            if(!(o instanceof Pair)) {
                return false;
            }
 
            Pair other = (Pair)o;
 
            if(this.a == other.a && this.b == other.b) {
                return true;
            }
 
            if(this.a == other.b && this.b == other.a) {
                return true;
            }
 
            return false;
        }
 
        @Override
		public int hashCode() {
			final int prime = 31;
			long result = 1;
            long lower = a <= b ? a : b;
            long higher = b > a ? b : a;
			result = prime * result + lower;
			result = prime * result + higher;
			return (int)result;
		}
 
        @Override
        public String toString() {
            return "(a: " + a + ", b: " + b + ")";
        }
    }
}