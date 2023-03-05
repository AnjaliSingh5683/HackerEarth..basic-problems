import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
 
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int countOnes = 0;
            int countFlips = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '0') {
                    // Don't flip it
                    int x = countOnes;
 
                    // Flip
                    int y = ++countFlips;
 
                    countFlips = Math.min (x, y);
                } else {
                    ++countOnes;
                }
            }
            countFlips = (countFlips + 1) / 2;
            
            System.out.println(countFlips);
        }
 
        sc.close();
    }
}