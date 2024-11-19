package src.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import src.models.Gemstone;

/**
 * Клас для створення намиста з каміння.
 */
public class Necklace {
    private List<Gemstone> gemstones; // Список каменів

    public Necklace() {
        this.gemstones = new ArrayList<>();
    }

    /**
     * Додати камінь до намиста.
     * 
     * @param gemstone Камінь
     */
    public void addGemstone(Gemstone gemstone) {
        if (gemstone == null) {
            throw new IllegalArgumentException("Камінь не може бути null!");
        }
        gemstones.add(gemstone);
    }

    /**
     * Обчислити загальну вагу намиста.
     * 
     * @return Загальна вага
     */
    public double calculateTotalWeight() {
        return gemstones.stream().mapToDouble(Gemstone::getWeight).sum();
    }

    /**
     * Обчислити загальну вартість намиста.
     * 
     * @return Загальна вартість
     */
    public double calculateTotalPrice() {
        return gemstones.stream().mapToDouble(Gemstone::getPrice).sum();
    }

    /**
     * Сортувати каміння за ціною.
     */
    public void sortByPrice() {
        gemstones.sort(Comparator.comparingDouble(Gemstone::getPrice));
    }

    /**
     * Знайти каміння за прозорістю.
     * 
     * @param min Мінімальна прозорість
     * @param max Максимальна прозорість
     * @return Список каменів у заданому діапазоні
     */
    public List<Gemstone> findByTransparency(int min, int max) {
        if (min < 0 || max > 100 || min > max) {
            throw new IllegalArgumentException("Невірний діапазон прозорості!");
        }
        List<Gemstone> result = new ArrayList<>();
        for (Gemstone gemstone : gemstones) {
            if (gemstone.getTransparency() >= min && gemstone.getTransparency() <= max) {
                result.add(gemstone);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Намисто з каміння:\n" + gemstones;
    }
}
