import java.util.Scanner;
public class starpattern
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("enter the no of rows");
int n=s.nextInt();
for (int i=0;i<n;i++)
{
for (int j=0;j<n;j++)
{
System.out.print("*");
}
System.out.println();
}}}
