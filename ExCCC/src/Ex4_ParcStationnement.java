import java.util.Scanner;

public class Ex4_ParcStationnement {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		String day1 = sc.nextLine();
		String day2 = sc.nextLine();
		int space = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(day1.charAt(i) == 'C' && day2.charAt(i) == 'C')
			space+=1;
		}
		System.out.println(space);
		
		sc.close();
	}

}
