import java.util.Observable;

public class Brandweer extends Hulpverlener {

    public Brandweer(Observable brandmelder) {
        super(brandmelder, "Brandweer");
    }

    @Override
    public void start() {
        System.out.println ("= Bel eigenaar brandmelder");
    }

    @Override
    public void actie() {
        System.out.println ("= Als er brand is, blus de brand!");
    }
}
