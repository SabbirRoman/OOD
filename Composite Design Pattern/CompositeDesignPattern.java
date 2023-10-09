public class CompositeDesignPattern {

    public static void main(String[] args) {
        Building building = new Building("Building");

        // Add generic housing structures to the building.
        HousingStructure apartment = new HousingStructure("Apartment");
        HousingStructure house = new HousingStructure("House");
        HousingStructure bungalow = new HousingStructure("Bungalow");

        building.addChild(apartment);
        building.addChild(house);
        building.addChild(bungalow);

        // Print the names of all the housing structures in the building.
        building.printName();
    }
}

class HousingStructure {
    private String name;

    public HousingStructure(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(name);
    }
}

class CompositeHousingStructure extends HousingStructure {
    private List<HousingStructure> children;

    public CompositeHousingStructure(String name) {
        super(name);
        this.children = new ArrayList<>();
    }

    public void addChild(HousingStructure child) {
        children.add(child);
    }

    @Override
    public void printName() {
        System.out.println(name);
        for (HousingStructure child : children) {
            child.printName();
        }
    }
}

class Building extends CompositeHousingStructure {

    public Building(String name) {
        super(name);
    }
}
