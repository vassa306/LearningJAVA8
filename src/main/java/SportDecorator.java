public class SportDecorator extends CarDecorator{

    public SportDecorator(Car car) {
        super(car);
    }

    @Override
    public String tuneSportCar() {
        return super.tuneSportCar()+ " "+applySportPackage();
    }

    public String applySportPackage(){
        return "sport bodykit";
    }
}
