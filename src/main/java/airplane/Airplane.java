package airplane;

/**
 * Created by Тарас on 30.01.2018.
 */
public class Airplane {
    String name;
    int speed;
    int power;
    int volume_of_tank;
    int fuel_consumption;// per hour
    int range_of_flight;

    public Airplane() {
    }

    public Airplane(String name, int speed, int power, int volume_of_tank, int fuel_consumption, int range_of_flight) {
        this.name = name;
        this.speed = speed;
        this.power = power;
        this.volume_of_tank = volume_of_tank;
        this.fuel_consumption = fuel_consumption;
        this.range_of_flight = range_of_flight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume_of_tank() {
        return volume_of_tank;
    }

    public void setVolume_of_tank(int volume_of_tank) {
        this.volume_of_tank = volume_of_tank;
    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public int getRange_of_flight() {
        return range_of_flight;
    }

    public void setRange_of_flight(int range_of_flight) {
        this.range_of_flight = range_of_flight;
    }

    @Override
    public String toString() {
        return "airplane{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", power=" + power +
                ", volume_of_tank=" + volume_of_tank +
                ", fuel_consumption=" + fuel_consumption +
                ", range_of_flight=" + range_of_flight +
                '}';
    }
}
