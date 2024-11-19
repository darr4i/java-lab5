package src.models;

/**
 * Клас для синтетичного каміння.
 */
public class SyntheticStone extends Gemstone {

    public SyntheticStone(String name, double weight, double price, int transparency) {
        super(name, weight, price, transparency);
    }

    @Override
    public String toString() {
        return "Синтетичний " + super.toString();
    }
}
