import java.util.Scanner;

public class SecretMessages {

	public static void main(String[] args) {
		
		// ask the user for a message to encode or decode
		System.out.println("Enter a message to encode or decode:");
		
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		
		while( message.length() > 0) {
				
			String out = "";
			
			System.out.print("Enter a secret key(-26 to 26)");
			int intKey = Integer.parseInt(scan.nextLine());
			
			char key = (char)intKey;
	
			for(int x=0; x< message.length(); x++) 
			{
				char in = message.charAt(x);
				if (in >= 'A' && in <= 'Z') {
					in += key;
					if (in > 'Z')
						in -=26;
					if (in < 'A')
						in +=26;
				}
				else if(in >= 'a' && in <= 'z') {
					in += key;
					if (in > 'z')
						in -=26;
					if (in < 'a')
						in +=26;
				}
				
				out += in;
				
				
			}
			System.out.println();
			System.out.println(out);
			System.out.println("Enter another message, or press enter to quit");
			
			message = scan.nextLine();
		}
	}

}
