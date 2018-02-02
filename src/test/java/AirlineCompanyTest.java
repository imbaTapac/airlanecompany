import airlinecompany.AirlineCompany;
import airplane.Airplane;
import airplane.CargoPlane;
import airplane.DangerousGoods;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Тарас on 02.02.2018.
 */
public class AirlineCompanyTest {
    private AirlineCompany airlineCompany;
    List<Airplane> airplaneList= new ArrayList();
    List<CargoPlane> cargoPlaneList = new ArrayList();
    List<DangerousGoods> dangerousGoodsList = new ArrayList();
    @Before
    public void  initTest() throws IOException {
        airlineCompany = new AirlineCompany();
        DangerousGoods AN_124 = new DangerousGoods("AN-124",865,4250,212350,17000,4800,120000,"Medicines");
        CargoPlane AN_12 = new CargoPlane("AN-12",660,4000,14270,2500,7200,21000);
        CargoPlane AN_26 = new CargoPlane("AN-26",460,4450,4850,1200,1850,6500);
        airplaneList.add(AN_124);
        airplaneList.add(AN_12);
        airplaneList.add(AN_26);
        cargoPlaneList.add(AN_12);
        cargoPlaneList.add(AN_124);
        cargoPlaneList.add(AN_26);
}

    @Test
    public void testSortByFlyingRange() {
        assertNotEquals(airplaneList.get(1),airlineCompany.SortByFlyingRange(airplaneList));
    }

    @Test
    public void testFindAricraftByName() {
        assertEquals(airplaneList.get(0),airlineCompany.FindAircraftByName(airplaneList,"AN-124"));
    }
    @Test
    public void testSortByFuelConsumption() {
        assertNotEquals(airplaneList,airlineCompany.SortByFuelConsumption(airplaneList,1200,2500));
        assertNotNull(airlineCompany.SortByFuelConsumption(airplaneList,1200,2500));
    }

}
