package entities;

import enums.RoomType;

public class Invoice {
    private double basicPayment;
    private double tax;
    private double totalPayment;

    public Invoice(){

    }

    public Invoice(double basicPayment, double tax, double totalPayment) {
        this.basicPayment = basicPayment;
        this.tax = tax;
        this.totalPayment = totalPayment;
    }

    public double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }



}
