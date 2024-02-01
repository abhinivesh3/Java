import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I know Your Name");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
    }
}