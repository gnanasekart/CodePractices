package SimpleJavaCode;

class Timecount
{
public static void main(String[] args)
{
long starttime = System.currentTimeMillis();
int x = 999996;
int n = 1000000;
int count = 0;
for (int i=0; i<n; i++)
{
count++;
if(i==x)
{
System.out.println("here is the number at"+count+ "time");
break;
}
}
long endtime = System.currentTimeMillis();
System.out.println("total time:"+(endtime - starttime)+"ms");
}
}
