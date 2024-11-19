package src;

import src.models.*;
import src.services.Necklace;

public class Main {
    public static void main(String[] args) {
        // Створюємо каміння
        Gemstone diamond = new PreciousStone("Діамант", 1.5, 5000, 95);
        Gemstone ruby = new PreciousStone("Рубін", 2.0, 3000, 80);
        Gemstone amber = new SemiPreciousStone("Бурштин", 3.5, 200, 70);
        Gemstone zircon = new SyntheticStone("Циркон", 1.0, 100, 90);

        // Створюємо намисто
        Necklace necklace = new Necklace();
        necklace.addGemstone(diamond);
        necklace.addGemstone(ruby);
        necklace.addGemstone(amber);
        necklace.addGemstone(zircon);

        // Виводимо інформацію про намисто
        System.out.println("Намисто:");
        System.out.println(necklace);

        // Розрахунок загальної ваги та вартості
        System.out.printf("Загальна вага: %.2f карати%n", necklace.calculateTotalWeight());
        System.out.printf("Загальна вартість: %.2f$%n", necklace.calculateTotalPrice());

        // Сортування каменів за ціною
        necklace.sortByPrice();
        System.out.println("Після сортування за ціною:");
        System.out.println(necklace);

        // Пошук за прозорістю
        System.out.println("Каміння з прозорістю від 80 до 100:");
        System.out.println(necklace.findByTransparency(80, 100));
    }
}
