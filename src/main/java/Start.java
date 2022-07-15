

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Start {

    public static void main(String[] args) {


        Car cobra = new Car("BMW", "E36", 20, 300000);
        Car mustang = new Car("Ford", "Mustang", 2, 300000);
        System.out.println(cobra.toString() + Currencies.CZK);
        System.out.println(mustang.toString() + Currencies.CZK);

        Map<String, Object> carlist = new HashMap<String, Object>();
        carlist.put("first car", cobra);
        carlist.put("second car", mustang);

        System.out.println(carlist.get("first car"));
        System.out.println(carlist.size());

        //iterate through Hashmap

        Set<String> keys = carlist.keySet();
        for (String key : keys) {
           System.out.println("Key -->  " + key + "  Values is--->" + carlist.get(key));
        }

        Start start = new Start();
        CarService carService = new CarService();
        LinkedList<Car> carlist1 = carService.getCarlist1();
        System.out.println("Printing Carlist");
        carlist1.add(cobra);
      //  carService.printList(carlist1);

        /*Remove car from Carlist*/
        carService.removeCar(cobra);
        carService.printList(carlist1);

        carService.addCar(cobra);
        CarDecorator card = new CarDecorator(cobra);
        Car dodge = new Car("Dodge","Charger",20,2000000);
        Car superBee = new Car("Dodge","Coronet Super Bee",2,3500000);
        Car demon = new Car("Dodge","Demon SRT",1,2000000);
        System.out.println("car without tuning: " +dodge.toString() + " " + dodge.tuneSportCar());
        //add sport package
        carService.addCar(dodge);
        carService.addCar(superBee);
        carService.addCar(demon);
        carService.printList(carlist1);

        SportDecorator sport = new SportDecorator(dodge); //wrapping car with sport decorator
        System.out.println(dodge.toString() + " " + sport.tuneSportCar());

        //filtering dodge
        System.out.println();
        carlist1.stream().filter(car -> car.brand == "Dodge" ).forEach(car -> System.out.println("Dodge car"+ car.toString()));
    }
}
