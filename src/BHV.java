import java.util.Observable;

public class BHV extends Hulpverlener {

    public BHV (Observable brandmelder) {
        super(brandmelder, "BHV-er");
    }

    @Override
    public void start() {
        System.out.println ("= Ga naar verzamelpunt");
    }

    @Override
    public void actie() {
        System.out.println ("= Als er brand is, zorg dan dat pand ontruimd wordt!");
    }
}
