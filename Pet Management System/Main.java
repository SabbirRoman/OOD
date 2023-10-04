import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetManagementSystem petSystem = new PetManagementSystem();

        while (true) {
            System.out.println("\nPet Management System Menu:");
            System.out.println("1. Add a Pet");
            System.out.println("2. Display All Pets");
            System.out.println("3. Find a Pet by Name");
            System.out.println("4. Remove a Pet");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter pet name: ");
                    String petName = scanner.nextLine();
                    System.out.print("Enter species: ");
                    String species = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    petSystem.addPet(new Pet(petName, species, age));
                    break;
                case 2:
                    System.out.println("List of Pets:");
                    petSystem.displayPets();
                    break;
                case 3:
                    System.out.print("Enter pet name to find: ");
                    String nameToFind = scanner.nextLine();
                    Pet foundPet = petSystem.findPetByName(nameToFind);
                    if (foundPet != null) {
                        System.out.println("Found Pet: " + foundPet);
                    } else {
                        System.out.println("Pet not found: " + nameToFind);
                    }
                    break;
                case 4:
                    System.out.print("Enter pet name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    petSystem.removePet(nameToRemove);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
