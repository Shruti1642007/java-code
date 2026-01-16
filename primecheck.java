public class primecheck
{
public static void main()
{
int n =7;
Boolean isPrime = true;

if (n <= 1) 
{
isPrime = false;
}
{
for (int i = 2; i <= n / 2; i++)
{
if (n % i == 0)
{
isPrime = false;
break;
}
}
}
if (isPrime) {
System.out.println(n + " is a prime number.");
}
else 
{
System.out.println(n + " is Not a prime number.");
}
}
}
