package lab4;

public class RAM extends Component implements Electrical {

    private int capacity;

    public RAM() {
        super();
        this.capacity = 0;
    }

    public RAM(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnOnResource() {

    }

    @Override
    public void turnOffResource() {

    }
}
