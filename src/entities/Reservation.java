package entities;

import enums.RoomType;

import java.time.LocalDateTime;

public class Reservation {

    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Room room;
    private Invoice invoice;

    public Reservation(){

    }

    public Reservation(LocalDateTime checkIn, LocalDateTime checkOut, Room room, Invoice invoice) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
        this.invoice = invoice;
    }

    public LocalDateTime getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDateTime checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDateTime getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDateTime checkOut) {
        this.checkOut = checkOut;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }



}

