import java.util.Scanner;

public class GreetingDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Hello: %s",name);
    }
}
