// Define warehouse class
class Warehouse {
    private String location;
    private List<Product> products;

    public Warehouse(String location, List<Product> products) {
        this.location = location;
        this.products = products;
    }

    public int checkStock(String productName) {
        for (Product product : products) {
            if (product.getName().equals(productName)) {
                return product.getStock();
            }
        }
        return 0;
    }

    public boolean shipProduct(String productName, int quantity) {
        for (Product product : products) {
            if (product.getName().equals(productName) && product.getStock() >= quantity) {
                product.setStock(product.getStock() - quantity);
                return true;
            }
        }
        return false;
    }
}