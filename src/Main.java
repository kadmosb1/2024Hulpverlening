public class Main {

    public static void main(String[] args) {

        Brandmelder brandmelder = new Brandmelder ();

        new BHV (brandmelder);
        new Brandweer (brandmelder);

        brandmelder.trigger ();
    }
}