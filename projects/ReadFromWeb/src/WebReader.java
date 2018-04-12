import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WebReader {

	public static void main(String[] args) 
	{
		//supply the url as the first argument and the output text file 
		if (args.length>0)
		{
			String url = args[0];
			URLtoTextFile(url, args[1]);
		}
		else
		{
			String url = "https://en.wikipedia.org/wiki/Java_(programming_language)";
			URLtoTextFile(url, "output.txt");
			System.out.println("You can also use this in command line. First argument: URL, Second argument: OutputFile");
		}
	}
	public static void URLtoTextFile(String url, String file)
	{
		File out = new File(file);
		Scanner in = null;
		PrintWriter outie = null;
		try
		{
			URL page = new URL(url);
			in = new Scanner(page.openStream());
			outie = new PrintWriter(out);
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
		String data=null;
		while (in.hasNextLine())
		{
			data = in.nextLine();
			outie.println(data);
		}
		if (data!=null)
		{
			System.out.println("Success");
		}
		in.close();
		outie.close();
		ProcessBuilder p = new ProcessBuilder();
	    try
	    {
	    		String destination = out.getAbsolutePath();
	    		p.command("open", destination);
	    		p.start();
	    }
	    catch(IOException e)
	    {
	    		System.out.println(e);
	    }
	}

}
