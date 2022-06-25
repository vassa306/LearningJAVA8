import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        CarManufacture man = new CarManufacture();
        List<Car> storeList = new ArrayList<>();
        man.assembleCarlist();
        storeList = man.assembleCarlist();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(storeList.toString().toUpperCase());
        System.out.println("Current state in warehouse");
        System.out.println(stringBuilder.toString());
    }
}




