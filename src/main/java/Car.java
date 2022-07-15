import java.util.concurrent.atomic.AtomicInteger;

public class Car implements ITuningCompany {
    private final int id;
    String brand;
    String type;
    int count;
    int price;
    private static final AtomicInteger _id = new AtomicInteger(0);


    public Car(String brand, String type, int count, int price) {
        this.id = _id.incrementAndGet();
        this.brand = brand;
        this.type = type;
        this.count = count;
        this.price = price;
        ;
    }


    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "  id=" + id +
                        "  brand='" + brand + '\'' +
                        ", type='" + type + '\'' +
                        ", count=" + count +
                        ", price=" + price
                ;
    }

    @Override
    public String tuneSportCar() {
        return "without sport package";
    }

    @Override
    public String tuneOffroadCar() {
        return "without offroad package";
    }

    @Override
    public String tuneCar() {
        return null;
    }
}
