import .accounting.Account;

import java.math.BigDecimal;

public final class Main {

    public static void main(String[] args) {
        var comment = "Покупатель купил 10 чипсов по 100 рублей";
        var  = new BigDecimal (1000);
         varquantity = 10;

        var credit = Account.getInstance(0);
        var debit = Account.getInstance(1);

        Account.MakeTransaction(credit.getID(), quantity, debit.getID(), quantity, balance, comment);
    }
}
