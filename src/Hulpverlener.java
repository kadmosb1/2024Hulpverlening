import java.util.Observable;
import java.util.Observer;

public abstract class Hulpverlener implements Observer {

    private final String type;

    public Hulpverlener (Observable brandmelder, String type) {
        brandmelder.addObserver (this);
        this.type = type;
    }

    private void toonKader () {
        System.out.println ("==========================================");
    }
    private void toonHeader () {
        toonKader ();
        System.out.println ("= Instructie voor " + this.type);
    }

    private void toonFooter () {
        toonKader ();
        System.out.println ();
    }

    @Override
    public void update(Observable o, Object arg) {
        toonHeader ();
        start ();
        actie ();
        toonFooter ();
    }

    public abstract void start ();
    public abstract void actie ();
}
