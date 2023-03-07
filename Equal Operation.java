import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
/* Author: Rafi */
public class Solver {
	static FastReader in = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);
	public static void main(String[] args) throws IOException {
		int Tc = in.nextInt();
		for (int i = 1; i <= Tc; i++) {
			solve();
		}
		out.flush();
	}
 
	private static void solve() {
		int n = in.nextInt();
		int arr[] = new int[n];
		int g = 0;
		for(int i = 0 ; i<n ;i++) {
			arr[i]  = in.nextInt();
			g = GCD(g, arr[i]);
		}
		long res = 0;
		for(int i = 0 ; i<n ;i++) {
			res += (arr[i] / g -1);
		}
		out.println(res);
		
	}
	private static int GCD(int a , int b) {
		if( b==0 ) {
			return a;
		}
		return GCD(b, a%b);
	}
	
	
 
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		/**
		 * @return
		 */
		String nextLine() {
			String str = "";
			try {
				if (st.hasMoreTokens()) {
					str = st.nextToken("\n");
				} else {
					str = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}