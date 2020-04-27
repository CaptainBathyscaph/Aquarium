import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aquarium aquarium = new Aquarium();

        do {
            System.out.println("Введите имя рыбки ");
            String fishName = scanner.next();
            if (fishName.equals("break")) break;
            System.out.println("Введите стоимость рыбки");
            int fishPrice = scanner.nextInt();
            aquarium.addFish(new Fish(fishName, fishPrice));

        }
        while (true);
        aquarium.printAllFishes();

    }
}
