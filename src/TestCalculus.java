import java.util.Scanner;

public class TestCalculus {
    public static void main(String[] args) {
        Calculus calculus = new Calculus();
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj dwie ulubione liczby: pierwsza to... ");
        double x = scanner.nextDouble();
        System.out.println("druga to... ");
        double y = scanner.nextDouble();

        double calcResult = calculus.calculate(x, y);
        System.out.println("Uzycie kalkulatora magicznego daje wynik... " +calcResult);

    }
}
