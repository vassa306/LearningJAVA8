import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        CarManufacture man = new CarManufacture();
        List<Car> storeList = new ArrayList<>();
        man.assembleCarlist();
        storeList = man.assembleCarlist();
        System.out.println(storeList.toString());
    }
}




