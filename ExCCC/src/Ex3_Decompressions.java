import java.util.Scanner;

public class Ex3_Decompressions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int L=sc.nextInt();
		
		int[] n = new int[L];
		String[] s = new String[L];
		
		for (int i = 0; i < L; i++)
		{
			n[i] = sc.nextInt();
			s[i] = sc.next();
		}
			
		for (int i = 0; i < L; i++)
		{
			for(int j = 0; j < n[i]; j++) 
			{
				System.out.print(s[i]);		
			}
			System.out.println();
		}		
		
		sc.close();
	}

	
}
