public class factorial
{
public static void main()
{
int n = 5;
long fact = 1;
for (int i =1; i<=n; i++)
{
fact *=i;
}
System.out.println("Factorial of " + n +" is:" + fact);
}
}