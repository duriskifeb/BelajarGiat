package WICO.UserView;

import java.util.ArrayList;
import java.util.Scanner;

import WICO.DataModel.User;
import WICO.util.Util;



public class loginMenu {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("1", "admin", "admin")); // add
        users.add(new User("2", "user", "pass")); //
        users.add(new User("admin", "admin123", "admin")); // admin

        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter username: ");
        String usernameInput = input.nextLine(); // Mengubah scanner menjadi input

        System.out.print("Enter password: ");
        String passwordInput = input.nextLine(); // Mengubah scanner menjadi input

        // Check if username and password match
        User loggedInUser = null;
        for (User user : users) {
            if (user.getUsername().equals(usernameInput) && user.getPassword().equals(passwordInput)) {
                loggedInUser = user;
                break;
            }
        }

        // If user is found
        if (loggedInUser != null) {
            System.out.println("Login successful!");
            System.out.println("Welcome, " + loggedInUser.getUsername() + "! Your role is: " + loggedInUser.getRole());
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
}
