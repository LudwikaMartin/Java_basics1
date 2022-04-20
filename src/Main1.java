import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String name = scanner.nextLine();
        System.out.println("Cześć, " + name);

        System.out.println("Jak masz na nazwisko?");
        String lastname = scanner.nextLine();
        System.out.println("Twoje nazwisko to: " + lastname);

        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        System.out.println("Cześć, " + name + " " + lastname + " masz " + age);
        if (age > 18) {
            System.out.println("Jesteś pełnoletni/a");
        } else {
            System.out.println("Jesteś niepełnoletni/a");
        }




    }
}
