package services;


import entities.Reservation;
import enums.PaymentMethod;


import static enums.PaymentMethod.DEBIT;


public class PaymentService {

    public double calcularPagamento(double basicPayment, PaymentMethod paymentMethod) {


        if (paymentMethod == DEBIT) {
            basicPayment = basicPayment - (basicPayment * 0.10);

        } else {
            basicPayment = basicPayment + (basicPayment * 0.10);
        }
        return basicPayment;

    }
}
