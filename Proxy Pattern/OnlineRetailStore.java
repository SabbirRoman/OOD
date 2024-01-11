import java.util.ArrayList;
import java.util.List;

public class OnlineRetailStore {

    public static void main(String[] args) {
        // Create warehouses
        Warehouse warehouseUS = new Warehouse("US", List.of(
                new Product("Laptop", 1000, 5),
                new Product("Phone", 500, 10)
        ));
        Warehouse warehouseEU = new Warehouse("EU", List.of(
                new Product("Laptop", 1100, 3),
                new Product("Tablet", 300, 7)
        ));

        // Create global warehouse proxy
        GlobalWarehouseProxy globalProxy = new GlobalWarehouseProxy(List.of(warehouseUS, warehouseEU));

        // Check stock
        System.out.println("Laptops in stock globally: " + globalProxy.checkStock("Laptop"));

        // Ship product
        if (globalProxy.shipProduct("Phone", 2)) {
            System.out.println("Phone shipped successfully!");
        } else {
            System.out.println("Phone out of stock globally!");
        }
    }
}