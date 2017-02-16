class CountInt
{
public static void main(String args[])
{
int count=0;
int a;
Scanner in=new Scanner(System.in);
a=in.nextInt();
int temp=a;
if(temp>=0)
{
temp/=10;
count++;
}
System.out.println(count);
}
}
