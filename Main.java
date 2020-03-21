  import java.util.Scanner;

  class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanho do lado do quadrado: ");
		int n = sc.nextInt();
		 
		int x = n,i,j;
		for (i=0;i<x;i++)
		{   System.out.print("\n");
			for(j=0;j<x;j++)
			{
				if((i==0)||(i==x-1))
					System.out.print("*");
				else
				{
					if((j==0)||(j==x-1))
					    System.out.print("*");
					else
						System.out.print(" ");
				}
					
			}
		}
			
	}


}
