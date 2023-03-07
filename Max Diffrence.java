import java.io.*;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder("");
 
        try {
            reader = new BufferedReader(new FileReader(new File("../input.txt")));
        } catch (Exception e) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }
 
        int testCases = Integer.parseInt(reader.readLine());
 
        for (int testCase = 1; testCase <= testCases; testCase++) {
            int n = Integer.parseInt(reader.readLine());
            String[] s = reader.readLine().split(" ");
            long[] nums = new long[n];
 
            for (int i = 0; i < n; i++) nums[i] = Long.parseLong(s[i]);
 
            Arrays.sort(nums);
 
            long ans = 0;
 
            if (n > 2) {
                ans += nums[n-1] - nums[0];
                ans += nums[n-2] - nums[1];
            }
            ans = Math.max(ans, (long)(nums[n-1] - nums[0]));
            sb.append(ans + "\n");
        }
 
        writer.write(sb.toString());
        writer.flush();
    }
}