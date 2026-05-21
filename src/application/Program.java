package application;

import entities.Invoice;
import entities.Reservation;
import entities.Room;
import enums.PaymentMethod;
import enums.RoomType;
import services.PaymentService;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import static enums.PaymentMethod.DEBIT;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("BEM VINDO AO HOTEL ANJOS E CIA");
        System.out.print("Qual será o tipo de quarto? (PREMIUM ou CONVENTIONAL) ");
        String room = sc.nextLine();
        double pricePerNight =0;

        if (room.equals("PREMIUM")){
            pricePerNight = 500.0;
        } else if (room.equals("CONVENTIONAL")){
            pricePerNight = 250.0;
        }

        RoomType roomType = RoomType.valueOf(room);
        Room hotelRoom = new Room(roomType, pricePerNight);

        System.out.print("Informe a data de check in: (dd/MM/yyyy HH:mm) ");
        LocalDateTime checkIn = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Informe a data de check out: (dd/MM/yyyy HH:mm) ");
        LocalDateTime checkOut = LocalDateTime.parse(sc.nextLine(), fmt);

        Reservation reservation = new Reservation(checkIn, checkOut, hotelRoom, null);
        System.out.print("Você deseja pagar no DEBIT OU CREDIT?");
        String paymentmethod = sc.nextLine();

        PaymentService service = new PaymentService();


        PaymentMethod paymentMethod = PaymentMethod.valueOf(paymentmethod);
        double total = service.calcularPagamento(reservation, paymentMethod);





        sc.close();
    }
}
