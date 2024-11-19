package src.models;

/**
 * Клас для напівкоштовного каміння.
 */
public class SemiPreciousStone extends Gemstone {

    public SemiPreciousStone(String name, double weight, double price, int transparency) {
        super(name, weight, price, transparency);
    }

    @Override
    public String toString() {
        return "Напівкоштовний " + super.toString();
    }
}
