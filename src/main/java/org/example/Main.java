package org.example;

public class Main {
    public static void main(String[] args) {

        int initialAccount = 100; // Начальная сумма
        int amountDeposit = 1150; // Сумма пополнения
        // int paymentThreshold = 1000; // Порог оплаты

        int bonusAmount = amountDeposit / 100 + initialAccount; // Сумма бонуса
//
//        int finalAmount; // Итоговая оплата
//        if (amountDeposit >= 1000) {
//            finalAmount = amountDeposit + bonusAmount;
//        } else {
//            finalAmount = initialAccount + amountDeposit;
//        }

        int finalAmount = (amountDeposit >= 1000) ? amountDeposit + bonusAmount : initialAccount + amountDeposit;

        System.out.println("Сумма оплаты равна: " + finalAmount);
    }

}