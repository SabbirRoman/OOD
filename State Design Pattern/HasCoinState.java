class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void pressButton() {
        System.out.println("Button pressed, dispensing item");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed");
    }
}
