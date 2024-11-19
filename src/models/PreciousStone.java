package src.models;

/**
 * Клас для дорогоцінного каміння.
 */
public class PreciousStone extends Gemstone {

    public PreciousStone(String name, double weight, double price, int transparency) {
        super(name, weight, price, transparency);
    }

    @Override
    public String toString() {
        return "Дорогоцінний " + super.toString();
    }
}
