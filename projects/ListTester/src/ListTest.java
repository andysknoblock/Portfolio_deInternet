import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ListTest {

	public static void main(String[] args) 
	{
		Map<String, Dimension> bois = new HashMap<>();
		bois.put("Wanda", new Dimension(3,3));
		bois.put("Leonard", new Dimension(5,2));
		bois.put("Leonard", new Dimension(5,3));
		bois.put("Jenny", new Dimension(2,1));
		String j = "Jenny";
		bois.remove(j);
		System.out.println(bois);
		Set<String> keySet = bois.keySet();
		for (String key: keySet)
		{
			System.out.println("The person named " + key + " is located at " + bois.get(key));
		}
	}
}
