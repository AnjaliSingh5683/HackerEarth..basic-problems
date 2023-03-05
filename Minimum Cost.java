import java.util.*;
import java.io.*;
 
class P5 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[N];
            String[] tmp = br.readLine().split(" ");
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(tmp[i]);
                map.put(arr[i], i);
            }
            int[] aux = Arrays.copyOfRange(arr, 0, N);
            Arrays.sort(arr);
 
            // System.out.println(Arrays.toString(arr));
            long cost = 0;
            int i = 0;
            while (i < N) {
                if (arr[i] == aux[i]) {
                    i++;
                    continue;
                }
                int j = i + 1;
                int x = map.get(arr[i]);
                while (true) {
                    while (j < N && map.get(arr[j]) <= x) {
                        j++;
                    }
                    if (j >= N) {
                        break;
                    }
                    int t1 = map.get(arr[j]);
                    long x1 = (t1 - i + 1) * (t1 - i + 1);
                    long x2 = (x - i + 1) * (x - i + 1) + (t1 - i) * (t1 - i);
                    if (x1 > x2) {
                        break;
                    } else {
                        x = t1;
                    }
                }
                // System.out.println(i + " " + j);
                cost += (x - i + 1) * (x - i + 1);
                i = j;
            }
            System.out.println(cost);
 
        }
    }
}