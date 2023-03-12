import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
 
class ZooCreatures {
static InputReader inputReader=new InputReader(System.in);
static void solve()
{
long a=inputReader.nextLong();
long b=inputReader.nextLong();
long l=lcm(a,b);
long ans1=l/a;
long ans2=l/b;
out.println(ans1+" "+ans2);
}
static long gcd(long a,long b)
{
if (b==0)
{
return a;
}
return gcd(b,a%b);
}
static long lcm(long a,long b)
{
return (a*b)/gcd(a,b);
}
static PrintWriter out=new PrintWriter((System.out));
public static void main(String args[])throws IOException
{
new Thread(null,null,"BaZ",99999999)
{
public void run()
{
try
{
int t=inputReader.nextInt();
while (t-->0) {
solve();
}
out.close();
}
catch(Exception e)
{
e.printStackTrace();
System.exit(1);
}
}
}.start();
 
}
static class InputReader {
 
private InputStream stream;
private byte[] buf = new byte[8192];
private int curChar, snumChars;
private SpaceCharFilter filter;
 
public InputReader(InputStream stream) {
this.stream = stream;
}
 
public int snext() {
if (snumChars == -1)
throw new InputMismatchException();
if (curChar >= snumChars) {
curChar = 0;
try {
snumChars = stream.read(buf);
} catch (IOException e) {
throw new InputMismatchException();
}
if (snumChars <= 0)
return -1;
}
return buf[curChar++];
}
 
public int nextInt() {
int c = snext();
while (isSpaceChar(c))
c = snext();
int sgn = 1;
if (c == '-') {
sgn = -1;
c = snext();
}
int res = 0;
do {
if (c < '0' || c > '9')
throw new InputMismatchException();
res *= 10;
res += c - '0';
c = snext();
} while (!isSpaceChar(c));
return res * sgn;
}
 
public long nextLong() {
int c = snext();
while (isSpaceChar(c))
c = snext();
int sgn = 1;
if (c == '-') {
sgn = -1;
c = snext();
}
long res = 0;
do {
if (c < '0' || c > '9')
throw new InputMismatchException();
res *= 10;
res += c - '0';
c = snext();
} while (!isSpaceChar(c));
return res * sgn;
}
 
public int[] nextIntArray(int n) {
int a[] = new int[n];
for (int i = 0; i < n; i++)
a[i] = nextInt();
return a;
}
 
public String readString() {
int c = snext();
while (isSpaceChar(c))
c = snext();
StringBuilder res = new StringBuilder();
do {
res.appendCodePoint(c);
c = snext();
} while (!isSpaceChar(c));
return res.toString();
}
 
public boolean isSpaceChar(int c) {
if (filter != null)
return filter.isSpaceChar(c);
return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
}
 
public interface SpaceCharFilter {
public boolean isSpaceChar(int ch);
}
}
}