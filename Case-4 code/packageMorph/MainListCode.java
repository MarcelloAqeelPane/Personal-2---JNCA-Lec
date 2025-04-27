package packageMorph;

import java.util.Scanner;

public class MainListCode {
	
	public static void main (String[] args){
		//Initialize the scanner and database objects
		Scanner scanner = new Scanner(System.in);
        SingleList<Student> database = new SingleList<>();
        
        //the 'while(true) command sets this function to always show, only deactivating (switching to false) when the Exit button is entered
        while (true) {
            System.out.println("\nStudent Database Menu:");
            System.out.println("1. Add a Student");
            System.out.println("2. Display List");
            System.out.println("3. Delete All Data");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            
            //Choice function, adds 4 cases that play when inputting a number from 1-4, if its not any of those numbers, it is cancelled and we-
            //-return to the menu
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                continue;
            }
            
            //Cases that are used.
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Student NIM (max 10 digits): ");
                        int id = Integer.parseInt(scanner.nextLine());
                        if (String.valueOf(id).length() > 10) { //Check if the string is more than 10
                            System.out.println("NIM must be 10 digits or less!");
                            break;
                        }
                        
                        System.out.print("Enter Name (max 30 chars): ");
                        String name = scanner.nextLine();
                        if (name.length() > 30) { //Same goes for these ones
                            System.out.println("Name must be 30 characters or less!");
                            break;
                        }
                        
                        System.out.print("Enter Degree (max 50 chars): ");
                        String major = scanner.nextLine();
                        if (major.length() > 50) {
                            System.out.println("Degree must be 50 characters or less!");
                            break;
                        }
                        if (database.size < 5) {
                        database.push(new Student(id, name, major));
                        System.out.println("Student added successfully!");}
                        
                        else {
                        System.out.println("Student cannot be added. Database is full.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID format! Must be numeric.");} //Makes sure the ID is an int variable
                    
                    break;
                    
                case 2:
                    database.displayAllStudents();
                    break;
                    
                case 3:
                    database.popAll();
                    System.out.println("Data has been deleted.");
                    break;
                    
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
            
        }
        
    }
}
