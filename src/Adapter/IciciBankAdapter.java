package Adapter;

import Adapter.payment.icicibank.IciciBank;

public class IciciBankAdapter implements BankAPI{

    private IciciBank iciciBank = new IciciBank();

    @Override
    public void sendMoney(String from, String to, int amount) {
        iciciBank.makePayment(to,from,amount);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
