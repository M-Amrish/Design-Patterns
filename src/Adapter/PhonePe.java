package Adapter;

public class PhonePe {
    public static void main(String[] args) {

        BankAPI bankAPI = new YesBankAdapter();

        bankAPI.sendMoney("Amrish", "Rish",9000);
    }
}
