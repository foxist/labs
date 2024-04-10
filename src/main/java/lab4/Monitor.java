package lab4;

public class Monitor extends Component implements Electrical {

    private int frequency;
    private boolean switcher;

    public Monitor() {
        frequency = 0;
        switcher = false;
    }

    public Monitor(int frequency, boolean switcher) {
        this.frequency = frequency;
        this.switcher = switcher;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public boolean isTurnOn() {
        return switcher;
    }

    @Override
    public String toString() {
        return isTurnOn() ? "Monitor is on. The Frequency is " + frequency + "MHz" : "Monitor is off!";
    }

    @Override
    public void turnOnResource() {
        switcher = true;
    }

    @Override
    public void turnOffResource() {
        switcher = false;
    }
}
