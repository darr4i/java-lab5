package src.models;

/**
 * Базовий клас для опису каменів.
 */
public class Gemstone {
    private String name;          // Назва каменя
    private double weight;        // Вага в каратах
    private double price;         // Ціна в доларах
    private int transparency;     // Прозорість (у відсотках)

    /**
     * Конструктор для створення каменя.
     * 
     * @param name          Назва каменя
     * @param weight        Вага каменя
     * @param price         Ціна каменя
     * @param transparency  Прозорість каменя
     */
    public Gemstone(String name, double weight, double price, int transparency) {
        if (weight <= 0 || price <= 0 || transparency < 0 || transparency > 100) {
            throw new IllegalArgumentException("Некоректні параметри каменя!");
        }
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.transparency = transparency;
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Вага має бути більше 0!");
        }
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Ціна має бути більше 0!");
        }
        this.price = price;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        if (transparency < 0 || transparency > 100) {
            throw new IllegalArgumentException("Прозорість має бути у діапазоні від 0 до 100!");
        }
        this.transparency = transparency;
    }

    @Override
    public String toString() {
        return String.format("Камінь: %s, вага: %.2f карат, ціна: %.2f$, прозорість: %d%%",
                name, weight, price, transparency);
    }
}
