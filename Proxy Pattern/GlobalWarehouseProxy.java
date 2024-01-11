// Define global warehouse proxy class
class GlobalWarehouseProxy {
    private List<Warehouse> warehouses;

    public GlobalWarehouseProxy(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

    public int checkStock(String productName) {
        for (Warehouse warehouse : warehouses) {
            int stock = warehouse.checkStock(productName);
            if (stock > 0) {
                return stock;
            }
        }
        return 0;
    }

    public boolean shipProduct(String productName, int quantity) {
        for (Warehouse warehouse : warehouses) {
            if (warehouse.shipProduct(productName, quantity)) {
                return true;
            }
        }
        return false;
    }
}