package projectH7;

import java.util.HashMap;
import java.util.Scanner;

public class User {
	private String userId;	
	
	public User(String userId) {
		this.userId = userId;
	}


	public void viewRoute() {
		RouteMaster calling_route = new RouteMaster();
		calling_route.viewAllRoutes();		
	}
	
	void updateUserDetails() {
		HashMap<String, String> userDetails = new HashMap<>(); 
		
		System.out.println("Select Details to Update");
        System.out.println("1. Phone Number: ");
        System.out.println("2. Address: ");
        System.out.println("3. City: ");
        System.out.println("4. Stop: ");
        System.out.println("5. Password: ");
        System.out.println("6. go to previous Menu: ");
        boolean c = true;
         
		while(c) {
			System.out.println("Input: ");
	        Scanner input = new Scanner(System.in);
	        int choice = input.nextInt();
            switch (choice) {
                case 1:
                	System.out.print("Enter Phone Number: ");       
                	Scanner phone_num = new Scanner(System.in); 
                	userDetails.put("phone_num", Integer.toString(phone_num.nextInt()));
                    break;
                case 2:
                	System.out.print("Enter Address: ");      
                	Scanner address = new Scanner(System.in);                	          	
                	userDetails.put("address", address.nextLine());
                	break;                	
                case 3:
                	System.out.print("Enter City: ");  
                	Scanner city = new Scanner(System.in);                	              	
                	userDetails.put("city", city.nextLine());
                	break;                    
                case 4:
                	System.out.print("Enter Bus Stop: ");
                	Scanner stop = new Scanner(System.in);                	                	
                	userDetails.put("stop", stop.nextLine());
                	userDetails.put("status", "pending");
                	System.out.println("As the stop is changed your pass is temprory deactivted for Admin approval.");
                    break;                	
                case 5:
                	System.out.print("Enter Password: ");
                	Scanner password = new Scanner(System.in); 
                	userDetails.put("password", password.nextLine());
                	break;      
                case 6:
                	c = false;
                	break;
                default:
                	System.out.println("Select Details to Update");
                    System.out.println("1. Phone Number: ");
                    System.out.println("2. Address: ");
                    System.out.println("3. City: ");
                    System.out.println("4. Stop: ");
                    System.out.println("5. Password: ");
                    System.out.println("Input: ");
            }

        }
		
	}
}
