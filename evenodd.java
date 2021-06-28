import java.util.scanner;
public class evenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,d,even=0,odd=0;
System.out.println("enter no.");
n=sc.nextInt();
while(n>0)
{
d=n%10;
n=n/10;
if(d%2==0)
{
even=even+1;
}
else
{
odd=odd+1;
}
}
System.out.println("even="+even);
System.out.println("odd="+odd);
}
}