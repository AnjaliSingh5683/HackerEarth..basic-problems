import java.util.Scanner;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[] balance=new int[n];
      Arrays.fill(balance,0);
 
      for(int i=0;i<m;i++)
      {
          String s=sc.next();
          int np=sc.nextInt();
          int ns=sc.nextInt();
          for(int k=0;k<np;k++)
          {
            int id=sc.nextInt();
            int amt=sc.nextInt();
            balance[id-1]-=amt;
          }
           for(int j=0;j<ns;j++)
          {
            int id=sc.nextInt();
            int amt=sc.nextInt();
            balance[id-1]+=amt;
          }
      }
      List<List<Integer>> ans=new ArrayList<>();
          int j=0;
          for(int i=0;i<n;i++)
          {
              if(balance[i]>0)
              {
                int curr=balance[i];
                while(curr>0 && j<n)
                {
                    if(balance[j]>=0)
                    {
                        j++;
                        continue;
                    }
                    int mini=Math.min(curr,Math.abs(balance[j]));
                    curr-=mini;
                    balance[j]+=mini;
                    List<Integer> res=new ArrayList<>();
                    res.add(i+1);
                    res.add(j+1);
                    res.add(mini);
                    ans.add(res);
                }
              }
          }
          for(int i=0;i<ans.size();i++)
          {
        System.out.print(ans.get(i).get(0)+" "+ans.get(i).get(1)+" "+ans.get(i).get(2));
        System.out.println();
          }
          
 
      
    }
}