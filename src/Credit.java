import java.util.Scanner; 
public class Credit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("Number of cases:");
		int N = key.nextInt();
		for (int j = 0; j<N; j++)
		{
			System.out.println("Credit Amount:");
			int C = key.nextInt();
			System.out.println("Number of items in store:");
			int I = key.nextInt();
			System.out.println("Enter prices of items in store separated by spaces:");
			String list = key.next();
			for (int z = 1; z<I; z++)
			{
			list = list + " " + key.next();
			}
			String [] P = list.split(" ");
			int [] Pint = new int[P.length];
			for (int s = 0; s<P.length; s++)
			{
				Pint[s] = Integer.parseInt(P[s]);
			}
			for (int a=0; a<Pint.length; a++)
			{
				for (int b=0; b<Pint.length; b++)
				{
					if ((a!=b)&&(C==(Pint[a]+Pint[b])))
					{
						if (a<b)
						{
							System.out.println("Case #" + (j+1) + ": " + (a+1) + " " + (b+1));
						}
						
					}
					
				}
			}
		}
	}

}
