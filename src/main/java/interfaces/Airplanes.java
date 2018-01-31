package interfaces;

import airplane.Airplane;

import java.io.IOException;
import java.util.List;

/**
 * Created by Тарас on 30.01.2018.
 */
public interface Airplanes {
    List<Airplane> ListOfAirline (List<Airplane >airplaneList);
    List<Airplane> SortByFlyingRange (List<Airplane >airplaneList);
    List<Airplane> SortByFuelConsumption (List<Airplane >airplaneList) throws IOException;
    double Throughput_Airport() throws IOException;
    void FindAircraftByName(List<Airplane>airplaneList) throws IOException;
}
