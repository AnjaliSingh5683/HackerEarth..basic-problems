import java.util.*;
import java.io.*;
 
public class HackerEarth {
 
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new PrintWriter(System.out)));
        StringBuilder sb = new StringBuilder();
 
        int t = Integer.parseInt(br.readLine());
 
        while (t --> 0) {
 
            String arr[] = new String[3];
            for (int i = 0; i < 3; i++) arr[i] = br.readLine();
 
            sb.append(path(arr, 0, 0) ? "YES" : "NO").append("\n");
        }
        
        pw.println(sb.toString().trim());
        pw.close();
        br.close();
    }
 
    public static boolean path(String arr[], int x, int y) {
 
        if (x == 2 && y == 2) return true;
 
        boolean flag = false;
 
        if (x + 1 < 3 && arr[x + 1].charAt(y) != '*') flag |= path(arr, x + 1, y);
        if (y + 1 < 3 && arr[x].charAt(y + 1) != '*') flag |= path(arr, x, y + 1);
        if (x + 1 < 3 && y + 1 < 3 && arr[x + 1].charAt(y + 1) != '*') flag |= path(arr, x + 1, y + 1);
 
        return flag;
    }
}