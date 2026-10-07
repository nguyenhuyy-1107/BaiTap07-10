package Bt3;


class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("khong dung tien mat", "CreditCard");
    }

    @Override
    public String getMoTaThanhToan() {
        return "bang the tin dung";
    }
}

class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("khong dung tien mat", "PayPal");
    }

    @Override
    public String getMoTaThanhToan() {
        return "qua PayPal";
    }
}

class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("truc tiep", "Cash");
    }

    @Override
    public String getMoTaThanhToan() {
        return "bang tien mat";
    }
}

class MoMoPayment extends PaymentMethod {
    public MoMoPayment() {
        super("khong dung tien mat", "MoMo");
    }

    @Override
    public String getMoTaThanhToan() {
        return "qua MoMo";
    }
}