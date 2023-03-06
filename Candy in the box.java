/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
Scanner vk=new Scanner(System.in);
int t=vk.nextInt(),n,k,i;
boolean b;
while(t-->0){
    n=vk.nextInt();
    k=vk.nextInt();
    if(k<=n){
        System.out.println(k);
        continue;
    }
    if((((k-1)/(n-1))&1)==0)
        b=true;
    else 
        b=false;
    k-=n;
    k%=(n-1);
    if(b)
        System.out.println(k+1);
    else
        System.out.println(n-k);
}
    }
}