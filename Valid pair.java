import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long ans=0;
        Map<Long,Integer>mp=new TreeMap<>();
        List<Long> arr=new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            long x = sc.nextLong();
            arr.add(x);
            if (i > 0) {
                long sum = 3;
                int p = 1;
                while (p <= 30) {
                    long req = sum - x;
                    if (mp.containsKey(req)) {
                        ans += mp.get(req);
                    }
                    p++;
                    sum *= (3L);
                }
            }
            if (mp.containsKey(x)) {
                int ct = mp.get(x);
                mp.put(x, ct + 1);
            } else {
                mp.put(x, 1);
            }
        }
        System.out.println(ans);
 
 
 
    }
}