// Client code
public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertCoin();  // Coin inserted
        vendingMachine.pressButton(); // Please insert a coin first

        vendingMachine.insertCoin();  // Coin already inserted
        vendingMachine.pressButton(); // Button pressed, dispensing item
        vendingMachine.dispenseItem(); // Item dispensed

        vendingMachine.insertCoin();  // Coin inserted
        vendingMachine.pressButton(); // Please insert a coin first
    }
}
