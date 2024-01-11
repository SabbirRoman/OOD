// Context class (Vending Machine)
class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new NoCoinState();
    }

    public void setState(VendingMachineState state) {
        currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
        if (currentState instanceof NoCoinState) {
            setState(new HasCoinState());
        }
    }

    public void pressButton() {
        currentState.pressButton();
        if (currentState instanceof HasCoinState) {
            currentState.dispenseItem();
            setState(new NoCoinState());
        }
    }
}

