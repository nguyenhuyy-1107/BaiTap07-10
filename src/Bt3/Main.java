package Bt3;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("A", 200000, new CreditCardPayment());
        Order order2 = new Order("B", 150000, new PayPalPayment());
        Order order3 = new Order("C", 100000, new CashPayment());
        Order order4 = new Order("D", 300000, new MoMoPayment());

        order1.checkout();
        order2.checkout();
        order3.checkout();
        order4.checkout();
    }
}