import java.util.Scanner;
class PR{
	 public static void main (String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the num n1");
	int n1 =scan.nextInt();
	System.out.println("Enter the num n2");
	int n2 =scan.nextInt();
	System.out.println(n1 +"+" + n2 + "=" + (n1+n2));
	System.out.println(n1 +"-" + n2 + "=" + (n1-n2));
	System.out.println(n1 +"*" + n2 + "=" + (n1*n2));
	System.out.println(n1 +"/" + n2 + "=" + (n1/n2));
        }
}