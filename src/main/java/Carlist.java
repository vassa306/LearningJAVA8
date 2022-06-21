import java.util.ArrayList;
import java.util.List;

public class Carlist {

        List<Car> carList = new ArrayList<Car>();

    public List<Car> getCarList() {
        Car AudiS3 = new CarBuilder().setBrand(Car.Brand.AUDI).setTypes(Car.Types.S32004).setSpz("0000000").setColor(Car.Color.red).createCar();
        Car BMEE36 = new CarBuilder().setBrand(Car.Brand.BMW).setTypes(Car.Types.E36).setSpz("999999").setColor(Car.Color.blue).createCar();
        carList.add(AudiS3);
        carList.add(BMEE36);
        return carList;

    }

    public void main(String[] args) {
        getCarList();
    }









}
