package FirstPackage;

import java.util.Scanner;

public class FavoriteNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite number : ");
        int favoriteNumber = scan.nextInt();
        System.out.println(favoriteNumber+" is my favorite number too...");
    }
}
