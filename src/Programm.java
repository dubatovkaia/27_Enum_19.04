public class Programm {
    public static void main(String[] args) {
        Tshirts tshirt1 = new Tshirts("LitvinTroll", Sizes.S);
        Tshirts tshirt2 = new Tshirts("Znich", Sizes.XL);
        System.out.println(tshirt1.toString() + "\n" + tshirt2.toString());
        System.out.println("Готово!");
    }
}
