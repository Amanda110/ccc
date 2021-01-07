import java.util.Scanner;

public class Ex2_JoyeuxTriste {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String text;
		text=sc.nextLine();
		
		int mJoyeux= 0;
		int mTriste = 0;
		
		for(int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) == ':' && text.charAt(i+1) == '-')
				if (text.charAt(i+2) == ')')
				{
					mJoyeux+=1;
				}
				else if (text.charAt(i+2) == '(')
				{
					mTriste+=1;
				}
		}

		if (mJoyeux == 0 && mTriste == 0)
			System.out.println("none");
		else if(mJoyeux < mTriste)
			System.out.println("sad");
		else if(mJoyeux > mTriste)
			System.out.println("happy");
		else if(mJoyeux == mTriste)
			System.out.println("unsure");
		
		sc.close();
	}

}
