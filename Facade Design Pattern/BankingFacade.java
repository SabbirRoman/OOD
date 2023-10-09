class BankingFacade {
    private CheckingModule checkingModule;
    private SavingModule savingModule;
    private InvestmentModule investmentModule;

    public BankingFacade() {
        checkingModule = new CheckingModule();
        savingModule = new SavingModule();
        investmentModule = new InvestmentModule();
    }

    public void openAccount(String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingModule.openCheckingAccount();
        } else if (accountType.equalsIgnoreCase("saving")) {
            savingModule.openSavingAccount();
        } else if (accountType.equalsIgnoreCase("investment")) {
            investmentModule.investMoney();
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void closeAccount(String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingModule.closeCheckingAccount();
        } else if (accountType.equalsIgnoreCase("saving")) {
            savingModule.closeSavingAccount();
        } else if (accountType.equalsIgnoreCase("investment")) {
            investmentModule.withdrawInvestment();
        } else {
            System.out.println("Invalid account type");
        }
    }
}
