import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć, " + name);

        System.out.println("Jak masz na nazwisko?");
        String lastname = scanner.nextLine();
        System.out.println("Twoje nazwisko to: " + lastname);

        System.out.println("Ile masz lat?");
        String age = scanner.nextLine();

        System.out.println("Jaką mamy dziś datę?");
        String data = scanner.nextLine();

        System.out.println("Cześć, " + name + " " + lastname + " masz " + age + " lat. A dzisiejsza data to: " + data);


    }
}

