импорт программы .учет.Учет;

java import.math.BigDecimal;

Главный  класс  итоговый  публичный {

    основная  пустая  статическая  публичная(строка[] аргументов) {
        comment var = "Покупатель купил 10 чипсов по 100 рублей";
        переменная баланса  = новая  десятичная цифра (1000);
         varquantity = 10;

        credit var = Account.getInstance(0);
        debit var = Account.getInstance(1);

        Account.MakeTransaction(credit.getId(), количество, debit.getId(), количество, баланс, комментарий);
    }
}
