import java.io.*;
import java.util.*;
class TestClass {
   public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
		String inp = br.readLine().trim();
		while (!inp.equals("42")) {
			bo.write(inp + "\n");
			inp = br.readLine().trim();
		}
		bo.flush();
		bo.close();
		br.close();
	}
}