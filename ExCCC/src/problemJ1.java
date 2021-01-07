import java.util.Scanner;

public class problemJ1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int b1, b2, b3;
		int a1, a2, a3;
			
		System.out.println("tirs à 3 points pour l'équipe A");
		a3=sc.nextInt();
		System.out.println("tirs à 2 points pour l'équipe A");
		a2=sc.nextInt();
		System.out.println("tirs à 1 point pour l'équipe A");
		a1=sc.nextInt();
		System.out.println("tirs à 3 points pour l'équipe B");
		b3=sc.nextInt();
		System.out.println("tirs à 2 points pour l'équipe B");
		b2=sc.nextInt();
		System.out.println("tirs à 1 point pour l'équipe b");
		b1=sc.nextInt();
		
		if (a3 + a2 + a1 < b3 + b2 + b1)
			System.out.println ("B");
		else if(a3 + a2 + a1 > b3 + b2 + b1)
			System.out.println ("A");
		else if (a3 + a2 + a1 == b3 + b2 + b1)
			System.out.println ("T");
		
		sc.close();
			
	}

}
