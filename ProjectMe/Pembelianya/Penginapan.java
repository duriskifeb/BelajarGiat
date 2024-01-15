package ProjectMe.Pembelianya;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class HotelReservation {
    private String guestName;
    private String hotelName;
    private int numberOfNights;
    private double totalPrice;

    public HotelReservation(String guestName, String hotelName, int numberOfNights) {
        this.guestName = guestName;
        this.hotelName = hotelName;
        this.numberOfNights = numberOfNights;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        // Implement your logic for calculating the total price (e.g., based on nightly
        // rate)
        // For simplicity, let's assume a fixed nightly rate of $100 in this example.
        return 100.0 * numberOfNights;
    }

    @Override
    public String toString() {
        return "Guest: " + guestName + ", Hotel: " + hotelName +
                ", Nights: " + numberOfNights + ", Total Price: $" + totalPrice;
    }
}

class HotelBookingSystem {
    public List<HotelReservation> reservations;

    public HotelBookingSystem() {
        this.reservations = new ArrayList<>();
    }

    public void makeReservation(String guestName, String hotelName, int numberOfNights) {
        HotelReservation reservation = new HotelReservation(guestName, hotelName, numberOfNights);
        reservations.add(reservation);
        System.out.println("Reservation successful:\n" + reservation);
    }

    public void displayReservations() {
        System.out.println("List of Hotel Reservations:");
        for (HotelReservation reservation : reservations) {
            System.out.println(reservation);
        }
    }
}

public class Penginapan {
    public static void main(String[] args) {
        HotelBookingSystem bookingSystem = new HotelBookingSystem();
        Scanner scanner = new Scanner(System.in);

        // Example reservations
        bookingSystem.makeReservation("John Doe", "Hotel A", 3);
        bookingSystem.makeReservation("Jane Smith", "Hotel B", 2);

        // Display all reservations
        bookingSystem.displayReservations();

        // You can add more reservation logic or interactive input based on your
        // requirements.
    }
}
