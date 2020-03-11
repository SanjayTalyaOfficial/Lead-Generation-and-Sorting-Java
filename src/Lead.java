import java.io.*;
import java.util.*;
import java.util.stream.*;
public class Lead {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you the admin?");
		System.out.println("If yes type 1 else type 0");
		String admin= sc.nextLine();
		System.out.println("Are you looking for a Quick Cure??");
		System.out.println("If Yes, Please Type 1 and start entering your details or type 0 ");
		int choice = sc.nextInt();
		switch(choice)
		{
		
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
			details.add(name);
			details.add(phone);
			details.add(email);
			details.add(country);
			details.add(problem);
			try
			{
				
				FileWriter data = new FileWriter("patients.csv");
				
				String collect = details.stream().collect(Collectors.joining(","));
				data.write(collect);
				data.close();
				System.out.println("Successfully wrote to the file.");
			}
			
			catch (IOException e) 
			{
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}

}
