//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
 
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
            InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(r);
        int n=Integer.parseInt(in.readLine());
        String s=in.readLine();
        
        if(s.contains("HH"))
        {
            System.out.println("NO");
        }
        else
        {
            s=s.replace('.','B');
            System.out.println("YES");
            System.out.println(s);
        }
 
    }
}
 