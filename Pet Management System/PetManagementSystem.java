import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class PetManagementSystem {
    private List<Pet> petList;

    public PetManagementSystem() {
        petList = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    public void displayPets() {
        for (Pet pet : petList) {
            System.out.println(pet);
        }
    }

    public Pet findPetByName(String name) {
        for (Pet pet : petList) {
            if (pet.getName().equalsIgnoreCase(name)) {
                return pet;
            }
        }
        return null;
    }

    public void removePet(String name) {
        Pet petToRemove = findPetByName(name);
        if (petToRemove != null) {
            petList.remove(petToRemove);
            System.out.println("Pet removed: " + petToRemove.getName());
        } else {
            System.out.println("Pet not found: " + name);
        }
    }
}