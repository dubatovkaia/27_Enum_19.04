public class Tshirts {
    String name;
    Sizes size;

    public Tshirts(String name, Sizes size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "name = " + name + ", size = " + size;
    }
}
