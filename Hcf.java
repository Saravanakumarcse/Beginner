class Hcf
{
public static void main(String args[])
{
int a,b,x,y,hcf;
Scanner in=new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
a=x;
b=y;
int temp;
while(!b=0)
{
temp=a;
b=a%b;
a=temp;
}
hcf=a;
System.out.println(hcf);
}

