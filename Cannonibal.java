/*
import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
 
            int out_ = Minimum_Operations(n, s);
            System.out.println(out_);
            
         }
 
         wr.close();
         br.close();
    }
    static int Minimum_Operations(int n, String s){
       // Write your code here
        int result = 0;
 
        return result;
    
    }
}
*/
 
import java.io.*;
import java.util.*;
 
 
public class TestClass {
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter wr = new PrintWriter(System.out);
int T = Integer.parseInt(br.readLine().trim());
for(int t_i = 0; t_i < T; t_i++)
{
int n = Integer.parseInt(br.readLine().trim());
String s = br.readLine();
 
int out_ = Minimum_Operations(n, s);
System.out.println(out_);
 
}
 
wr.close();
br.close();
}
static int Minimum_Operations(int n, String s){
// Write your code here
int result = 0;
int[] arr = new int[26];
for(char c : s.toCharArray()) {
arr[c-97]++;
}
 
for(int i : arr) {
result += i/2;
}
return result;
}
}