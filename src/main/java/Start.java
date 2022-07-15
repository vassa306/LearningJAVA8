

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Start {

    public static void main(String[] args) {


        Car cobra = new Car("BMW", "E36", 20, 300000);
        Car mustang = new Car("Ford", "Mustang", 2, 3000000);
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
        Car dodge = new Car("Dodge", "Charger", 20, 2000000);
        Car superBee = new Car("Dodge", "Coronet Super Bee", 2, 3500000);
        Car demon = new Car("Dodge", "Demon SRT", 1, 2000000);
        System.out.println("car without tuning: " + dodge.toString()+Currencies.CZK + " " + dodge.tuneSportCar());
        //add sport package
        carService.addCar(dodge);
        carService.addCar(superBee);
        carService.addCar(demon);
        carService.printList(carlist1);

        SportDecorator sport = new SportDecorator(dodge); //wrapping car with sport decorator
        System.out.println(dodge.toString() + " " + sport.tuneSportCar());

        //filtering cars
        System.out.println();
        carlist1.stream().filter(car -> car.brand == "Dodge").forEach(car -> System.out.println("Dodge car" + car.toString()));
        System.out.println("-------------------------------------------------------------------------------------------------");
        long count = carlist1.stream()
                .filter(car -> car.price > 1000000)
                .count();
        if (count > 0) {
            System.out.println("Number of cars with price greater than milion : \n " + count);
        } else {
            System.out.println("Carlist does not include car with higher price than 1000 000");
        }
            if (carlist1.size() > 0) {
                //filter all cars with higher price than 1000 000
                carlist1.stream().filter(car -> car.price > 1000000).forEach(car -> System.out.println(car.toString()));
            } else {
                System.out.println("Carlist is empty");
            }

        }
    }

