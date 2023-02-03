import java.util.HashSet;
import java.util.Set;

public class RackBuilder implements Builder {
    Set<Shelf> rack;

    public RackBuilder() {
        rack = new HashSet<>();
    }

    public void add(Shelf shelf) throws RackException {
        if(rack ==null){
            throw new RackException("there is no rack");
        }
        rack.add(shelf);
    }

    public Rack toBookStand() {
        return new Rack(rack);
    }
}
