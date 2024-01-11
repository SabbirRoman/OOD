// Concrete state classes
class NoCoinState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("Coin inserted");
    }

    @Override
    public void pressButton() {
        System.out.println("Please insert a coin first");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please press the button first");
    }
}


