/* Trick
To fing n number of factors of 2 */
 
 
 
import java.io.*;
import java.util.*;
public class TestClass 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>0)
        {
            int x=in.nextInt();
            x=x*2;
            int a[]=new int[x];
            for(int y=0;y<x;y++)
            {
                a[y]=in.nextInt();
            }
            int c=0;
            for(int y=0;y<x;y++)
            {
                if(a[y]%2==0)
                {
                    int i=a[y];
                    while(i%2==0)
                    {
                        i=i/2;
                        c++;
                    }
                }
            }
            if(c>=x/2)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            n--;
        }
 
 
     
    }
}