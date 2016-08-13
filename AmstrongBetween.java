class AmstrongBetween
{
int a,b,c;
for(int i=0;i<1000;i++)
{
c=0;
for(int j=2;j<i;j++)
{
if(j%i==0)
{
c++;
}
if(c==0)
{
System.out.println(i+" ");
}
}
