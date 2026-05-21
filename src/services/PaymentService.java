package services;


import entities.Reservation;
import enums.PaymentMethod;


import static enums.PaymentMethod.DEBIT;


public class PaymentService {

    public double calcularPagamento(Reservation reservation, PaymentMethod paymentMethod) {

        double pricePerNight = reservation.getRoom().getPricePerNight();
        double basicPayment = pricePerNight;


        if (paymentMethod == DEBIT) {
        basicPayment = basicPayment - (basicPayment * 0.10);

        }  else {
        basicPayment = basicPayment + (basicPayment * 0.10);
    }
return basicPayment;

}}
