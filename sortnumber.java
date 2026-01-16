public class sortnumbers 
{
public static void main()
{
int[] arr = {30,12,45,7,25,90,18,60,5,40};
int temp;

for (int i = 0; i< arr.length - 1 - i; i++)
{
for (int j = 0; j < arr.length - 1 - i; j++)
{
if (arr[j] > arr[j+1])
{
temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
Sytem.out.println("Asscending order:");
for (int i = 0; i < arr.length; i++)
{
System.out.println(arr[i] + " ");
}
}
}
