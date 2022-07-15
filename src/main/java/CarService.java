import java.util.LinkedList;

public class CarService {
    private static final String name = null;
    private static final String ICONUMBER = "10000000";

    LinkedList<Car> carlist1 = new LinkedList<>();

    public LinkedList<Car>addCar(Car car) {

        if(car!=null) {
            carlist1.add(car);
        }else{
            System.out.println("carlist is empty");
        }

        for (Car c : carlist1){
      //      System.out.println("carlist contains this type of cars: " + c.toString());
        }

        return carlist1;
    }

    public LinkedList<Car> getCarlist1() {
        Car AudiS80 = new Car("Audi","80",23,300000);
        Car LamborAventador = new Car("Lamborghini", "Aventador",2,4500000);
        carlist1.add(AudiS80);
        carlist1.add(LamborAventador);
        return carlist1;
    }

    public void printList(LinkedList<Car>carlist1){

        for (Car c : carlist1){
            System.out.println("cars: " + c.toString());
        }

    }

    public LinkedList<Car>removeCar(Car car){
        if (car != null) {
            carlist1.remove(car);
            System.out.println("Car is removed from carlist");
        }else{
            System.out.println("carlist does not include this type of car");
        }
        return carlist1;
    }





    public static void main(String[] args) {



    }

}
