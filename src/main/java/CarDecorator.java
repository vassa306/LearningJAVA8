public class CarDecorator implements ITuningCompany {


    private Car car;


    public CarDecorator(Car car) {
        super();
        this.car = car;

    }

    @Override
    public String tuneSportCar() {
        return "carbon";
    }

    @Override
    public String tuneOffroadCar() {
        return "customization";
    }

    @Override
    public String tuneCar() {
        return "customization";
           }

}
