import java.util.*;
public class PositiveOrNegative
{
public static void main(String args[])
{
int n;
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(n>0)
{
System.out.println("Positive Number");
}
else if(n<0)
{
System.out.println("Negative Number");
}
else if(n==0)
{
System.out.println("Number is Zero");
}
else
{
System.out.println("Error");
}
}
