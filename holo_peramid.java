

public class holo_peramid {
	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <= 5; i++) 
		{
			for(int k=0;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) 
			{
				if(j==1 ||i==5 || j==i)
				{
					System.out.print("*"+" ");
				}
				else
				{
				System.out.print(" "+" ");
			}
			}
			
			System.out.println();
				
			
		}
		
	}

}

