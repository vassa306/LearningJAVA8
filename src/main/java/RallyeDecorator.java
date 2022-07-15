public class RallyeDecorator extends CarDecorator{


    public RallyeDecorator(Car car) {
        super(car);
    }

    @Override
    public String tuneOffroadCar() {
        return super.tuneOffroadCar()+applyRallyePackage();
    }

    public String applyRallyePackage(){
        return "WRC";
    }
}
