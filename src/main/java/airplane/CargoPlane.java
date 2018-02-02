package airplane;

/**
 * Created by Тарас on 30.01.2018.
 */
public class CargoPlane extends Airplane {
    int capacity;

    public CargoPlane(String name, int speed,int power, int volume_of_tank, int fuel_consumption, int range_of_flight,int capacity) {
        super(name, speed, power, volume_of_tank, fuel_consumption, range_of_flight);
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
