package lab4;

public class CPU extends Component implements Electrical {

    private int numberOfCores;

    public CPU () {
        super();
        this.numberOfCores = 0;
    }

    public CPU (int numberOfCores) {
        super();
        this.numberOfCores = numberOfCores;
    }

    @Override
    public void turnOnResource() {

    }

    @Override
    public void turnOffResource() {

    }
}
