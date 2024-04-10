package lab4;

public abstract class Component {

    private String model;
    private String manufacturer;
    private int price;

    public Component() {
        this.model = null;
        this.manufacturer = null;
        this.price = 0;
    }

    public Component(String model, String manufacturer, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }
}
