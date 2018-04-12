import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FifteenPointOne {

	public static void main(String[] args) 
	{
		System.out.println("This program prints a list of all dictionary words that would come from a numerical code");
		System.out.println("For example, the number 2 is mapped to the letters a, b, and c\nThe number 3 is mapped to d, e, and f\nand so on....\n");
		System.out.println("Enter a code of numbers: ");
		Scanner s = new Scanner(System.in);
		int code;
		if (s.hasNextInt())
		{
			code=s.nextInt();
			System.out.println("Working...");
		}
		else
		{
			code=0;
			System.out.println("Error numbers not entered");
		}
		Map<Character, Integer> toWords = new HashMap<>();
		int b=97, index=3;
		for (int a=2; a<10; a++)
		{
			if (a==7 || a==9)
				index=b+4;
			else
				index=b+3;
			while (b<index)
			{
				toWords.put((char)(b), a);
				b++;
			}
		}
		Set<String> base = new HashSet<>();
		Set<String> possibles = new HashSet<>();
		Set<Character> charList = toWords.keySet();
		for (int a=0; a<digits(code); a++)
		{
			int c = (digit(code, a));
			for (Character key:charList)
			{
				if (toWords.get(key)==c)
				{
					possibles.add(Character.toString(key));
					if (a>0)
					{
						//for (int i=0)
					}
				}
			}
			base=possibles;
			possibles=null;
		}
		
		

	}
	public static int digits(int a)
	{
		int b=0;
		while  (a>0)
		{
			a/=10;
			b++;
		}
		return b;
	}
	public static int digit(int a, int b)
	{
		int digits = digits(a);
		int temp=a;
		if (b>0)
		{
			while (temp>=10)
			{
				temp/=10;
			}
			temp*= Math.pow(10,digits-1);
			return digit(a-temp,b-1);
		}
		while (a>=10)
		{
			a/=10;
		}
		return a;
	}
	public static boolean isInDictionary(String a)
	{
		Scanner s;
		try {
			s = new Scanner(new File("src//words.txt"));
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error dictionary not found");
			return false;
		}
		a=a.toLowerCase();
		while (s.hasNext())
		{
			String b = s.next();
			if (a.equals(b.toLowerCase()))
			{
				s.close();
				return true;
			}
				
		}
		s.close();
		return false;
		
	}

}
