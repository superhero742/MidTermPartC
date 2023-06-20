/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author synzp
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the list of possible genres
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Fantasy");
        System.out.println("5. Sci-Fi");

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to choose their favorite genre
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        String genre;
        switch (genreChoice) {
            case 1:
                genre = "Action";
                break;
            case 2:
                genre = "Comedy";
                break;
            case 3:
                genre = "Drama";
                break;
            case 4:
                genre = "Fantasy";
                break;
            case 5:
                genre = "Sci-Fi";
                break;
            default:
                System.out.println("Invalid genre choice. Setting default genre to 'Unknown'.");
                genre = "Unknown";
                break;
        }

        // Create the user profile
        UserProfile userProfile = new UserProfile(name, genre);

        // Display the confirmation message
        System.out.println("User profile created:");
        System.out.println(userProfile);
    }
}

class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteGenre() {
        return favoriteGenre;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nFavorite Genre: " + favoriteGenre;
    }
}
//done