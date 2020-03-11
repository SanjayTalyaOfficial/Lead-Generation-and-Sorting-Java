import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Switch {
	public static void main(String args[]) {
		System.out.println("/////////////// Hello  Please Choose one of the Options below ///////////////////// ");
		System.out.println("1. Enter details as a patient");
		System.out.println("2. Access as admin");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("Enter your name");
			String name=sc.nextLine();
			System.out.println("Enter your phone Number");
			String phone=sc.nextLine();
			System.out.println("Enter your email");
			String email=sc.nextLine();
			System.out.println("Enter your country");
			String country=sc.nextLine();
			System.out.println("Enter your problem");
			String problem=sc.nextLine();
			sc.close();
			System.out.println("Your Name: "+name);
			System.out.println("Your Phone number: "+phone);
			System.out.println("Your Email: "+email);
			System.out.println("Your Country: "+country);
			System.out.println("Your Problem: "+problem);
			
			
			ArrayList<String> details = new ArrayList<String>();
			details.set(choice, name);
			details.set(choice, phone);
			details.set(choice, email);
			details.set(choice, country);
			details.set(choice, problem);break;
		case 2: 
			String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter username:");//username:user
	        username = s.nextLine();
	        System.out.print("Enter password:");//password:user
	        password = s.nextLine();
	        if(username.equals("user") && password.equals("user"))
	        {
	            System.out.println("Authentication Successful");
	            System.out.println("1. Display all the patients details");
	            System.out.println("2. Sort all the patients details");
	            Scanner userIn = new Scanner(System.in);
	            int userChoice = userIn.nextInt();
	            switch(userChoice)
	            {
	            case 1:
	            	break;
	            case 2:
	            	System.out.println("1. Sort by starting letter");
	            	System.out.println("2. Sort by country");
	            	System.out.println("3. Sort by problem");
	            	Scanner sort = new Scanner(System.in);
	            	int sortInput = sort.nextInt();
	            	switch(sortInput)
	            	{
	            	case 1: 
	            	}
	            }
	        }
	        else
	        {
	            System.out.println("Authentication Failed");
	        }s.close();
			
		}
	}

}
