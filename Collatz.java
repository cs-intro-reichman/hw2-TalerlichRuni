public class Collatz {
	public static void main(String args[]) {
		String mode = args[1];
		int times = Integer.parseInt(args[0]);
if (mode.equals("v") && times>0){
	System.out.println("1 4 2 1 (4)");
for (int i = 2; i < times+1; i++)
 {
	int z=i;
	int counter=0;
	System.out.print(i+" ");
	while(z!=1)
	{
		counter++;
		if(z%2==0)
		{
		z= z/2;
		System.out.print(z+ " ");
		}
		else
		{
		z=(z*3)+1;
		System.out.print(z + " ");
		}
	}
System.out.println("("+ (counter+1)  +")");
}
}
else
{
	for (int i = 1; i < times+1; i++)
	{
		int z=i;
		while(z!=1)
		{
			if(z%2==0)
			{
			z= z/2;
			}
			else
			{
			z=(z*3)+1;
			}
		}
	}

}
System.out.println("Every one of the first " +times+ " hailstone sequences reached 1.");
	}
}
