import java.util.Scanner;

public class Ex4_ParcStationnement {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n = sc.nextInt();
		String day1 = sc.next();
		String day2 = sc.next();
		int occ = 0;
		
		for(int i = 0; i < n; i++)
		{
			if(day1.charAt(i) == 'C' && day2.charAt(i) == 'C')
			occ+=1;
		}
		System.out.println(occ);
		
		sc.close();
	}

}
