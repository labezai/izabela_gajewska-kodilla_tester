package wallet.wallet;

import wallet.CashSlot;
import wallet.Wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        wallet.debit(amount);
        cashSlot.dispense(amount);
    }
}
