package airplane;

/**
 * Created by Тарас on 30.01.2018.
 this class for Cargo Planes which transport Dangerous Goods
 */
public class DangerousGoods extends CargoPlane {

    String typeOfGoods;
    public DangerousGoods(String name, int speed, int power, int volume_of_tank, int fuel_consumption, int range_of_flight, int capacity, String typeOfGoods) {
        super(name, speed, power, volume_of_tank, fuel_consumption, range_of_flight,capacity);
        this.typeOfGoods=typeOfGoods;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }
}
