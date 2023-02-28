import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        char[] nameArr = name.toCharArray();
        char zoo = name.charAt(0);
        int count = 1;
        for (int i = 1; i < nameArr.length; i++) {
            if (zoo == nameArr[i]) {
                count++;
            } else {
                break;
            }
        }
        if (name.substring(count).length() == 2 * count) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
 
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    }
}