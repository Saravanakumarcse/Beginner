class HcfUser
{
public static void main(String args[])
{
int a,b,x,y,temp,hcf;
System.out.println("Enter Given Number :");
Scanner in=new Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
a=x;
b=y;
while(b!=0)
{
temp=a;
b=a%b;
a=temp;
}
System.out.println(hcf);
}
}
