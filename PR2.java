import java.util.Scanner;
class PR2{
	public static void main(String args[])
	{
		Scanner Scan=new  Scanner(System.in);
		System.out.println("Enter The Three Number:");
		double a=Scan.nextDouble();
		double b=Scan.nextDouble();
		double c=Scan.nextDouble();
		double d=b*b-4*a*c;
		{
			if(d>0)
			{
				double x1=(-b+Math.sqrt(d)/2*a);
				double x2=(-b+Math.sqrt(d)/2*a);
				
				System.out.println("The Root Eq. :"+x1+"and"+x2);
			}
				else if(d==0)
				{
					double x1 =-b/2*a;
					double x2 =-b/2*a;
					System.out.println("The Root of Eq. :" +x1+ "and"+x2);
				}
				else
				{
					System.out.println("Imagnary roots:");
				}
			
		}
	
	}
}