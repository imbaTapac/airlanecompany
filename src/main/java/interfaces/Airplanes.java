package interfaces;

import airplane.Airplane;

import java.io.IOException;
import java.util.List;

/**
 * Created by Тарас on 30.01.2018.
 */
public interface Airplanes {
    void ListOfAirline (List<Airplane >airplaneList);
    List<Airplane> SortByFlyingRange (List<Airplane >airplaneList);
    List<Airplane> SortByFuelConsumption (List<Airplane >airplaneList,int consumptionMin,int consumptionMax) throws IOException;
    double Throughput_Airport() throws IOException;
    Airplane FindAircraftByName(List<Airplane>airplaneList,String name_aircaft) throws IOException;
}
