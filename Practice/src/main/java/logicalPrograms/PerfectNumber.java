package logicalPrograms;

public class PerfectNumber {

	public static void main(String[] args)
	{

		int n = 28;
		int temp=0;

		for(int i=1;i<n;i++) 
		{
			if(n%i==0)
			{
				temp = temp + i;             //1/3/7/14/28
			}
		}
		if(n==temp)
		{
			System.out.println(n+" is perfect number");
		}
		else
		{
			System.out.println(n+" is not perfect number");
		}
	}
}