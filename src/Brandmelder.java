import java.util.Observable;

public class Brandmelder extends Observable {

    public void trigger () {
        setChanged ();
        notifyObservers ();
    }
}
