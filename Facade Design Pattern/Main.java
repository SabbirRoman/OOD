public class Main {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade();

        // Open and close various types of accounts using the facade
        bankingFacade.openAccount("checking");
        bankingFacade.closeAccount("checking");

        bankingFacade.openAccount("saving");
        bankingFacade.closeAccount("saving");

        bankingFacade.openAccount("investment");
        bankingFacade.closeAccount("investment");

        // Invalid account type
        bankingFacade.openAccount("credit");
    }
}