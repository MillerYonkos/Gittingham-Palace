//first line of the pronhub chronicles!
import java.util.*;
import static java.lang.System.*;
public class TheBeginning
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		out.println("Enter Your Message to be Hashed");
		String message = input.next();

	}
	public static int hashCode(String jonny){
		int total = 0;
		for(int i = 0; i <= jonny.length(); i++){
			int nam = jonny.charAt(i);
			total += nam;
		}

		return total;
	}
}