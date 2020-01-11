import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstGitCode {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number");

		String read = br.readLine(

		try {

			int num = Integer.parseInt(read);

			System.out.println(num + 10);

		}

		catch (NumberFormatException e) {

			System.out.println("You should not give alpha values.......");
		}

		System.out.println("Welcome.........");
		
		System.out.println("Hi...............");

	}
}
