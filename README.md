# Получи рубль за каждые 100
## Условие
Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.

Примеры. Начальные данные: у клиента на счету 100 рублей.

1. Клиент пополнил счёт на 100 рублей — бонусов нет, итоговая сумма на счету клиента — 200 рублей.
2. Клиент пополнил счёт на 1100 рублей — бонус равен 11 рублям, итоговая сумма на счету клиента — 1211 рублей.


### Изначальный код выглядел так:

````java
int initialAccount = 100; // Начальная сумма
int amountDeposit = 1150; // Сумма пополнения
// int paymentThreshold = 1000; // Порог оплаты

        int bonusAmount = amountDeposit / 100 + initialAccount; // Сумма бонуса

        int finalAmount; // Итоговая оплата
        if (amountDeposit >= 1000) {
            finalAmount = amountDeposit + bonusAmount;
        } else {
            finalAmount = initialAccount + amountDeposit;
        }

       
        System.out.println("Сумма оплаты равна: " + finalAmount);
    }
````
### После, при применении тернарного оператора, код стал на много локоничнее:

````java

        int initialAccount = 100; // Начальная сумма
        int amountDeposit = 1150; // Сумма пополнения
        // int paymentThreshold = 1000; // Порог оплаты

        int bonusAmount = amountDeposit / 100 + initialAccount; // Сумма бонуса
        int finalAmount = (amountDeposit >= 1000) ? amountDeposit + bonusAmount : initialAccount + amountDeposit;

        System.out.println("Сумма оплаты равна: " + finalAmount);
    }
````






