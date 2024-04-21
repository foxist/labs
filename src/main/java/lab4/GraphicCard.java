package lab4;

public class GraphicCard extends Component implements Electrical {

    private int GDDR;

    public GraphicCard() {
        super();
        this.GDDR = 0;
    }

    public GraphicCard(int GDDR) {
        this.GDDR = GDDR;
    }

    @Override
    public void turnOnResource() {

    }

    @Override
    public void turnOffResource() {

    }
}
