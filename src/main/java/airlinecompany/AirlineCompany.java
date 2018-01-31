package airlinecompany;

import airplane.Airplane;
import interfaces.Airplanes;
import airplane.CargoPlane;
import interfaces.CargoPlanes;

import java.io.IOException;
import java.util.*;

/**
 * Created by Тарас on 30.01.2018.
 */
public class AirlineCompany implements Airplanes, CargoPlanes {

    public List<Airplane> ListOfAirline (List<Airplane >airplaneList){
        List<Airplane> airplanes = airplaneList;
        for (Airplane b1: airplanes){
            System.out.println("\n\n--------------"+b1.getName()+"--------------");
            System.out.println("------------Speed-----------\n\t\t\t"+b1.getSpeed()+"KM/H");
            System.out.println("------------Power----------\n\t\t\t"+b1.getPower()+"HP");
            System.out.println("------------Volume of tank--------\n\t\t\t"+b1.getVolume_of_tank()+"l.");
            System.out.println("------------Fuel Consumption--------\n\t\t\t"+b1.getFuel_consumption()+"l. per hour");
            System.out.println("------------Range of flight---------\n\t\t\t"+b1.getRange_of_flight()+"KM");
        }
        return airplanes;
    }

    public void PowerAndCapacity(List<CargoPlane>cargoPlaneList){
        int sumcapacity =0;
        int sumpower = 0;
        List<CargoPlane> airplanes = cargoPlaneList;
        for (CargoPlane b1: airplanes){
            sumcapacity+=b1.getCapacity();
            sumpower+=b1.getPower();
        }
        System.out.println("Summary capacity of Airplanes = "+sumcapacity+" KG");
        System.out.println("Summary power of Airplanes = "+sumpower+" HP");
    }

    public List<Airplane> SortByFlyingRange(List<Airplane >airplaneList){
        List<Airplane> airplanes = airplaneList;
        Collections.sort(airplanes, new Comparator<Airplane>() {
            public int compare(Airplane o1, Airplane o2) {
                return (int)(o1.getRange_of_flight()-o2.getRange_of_flight());
            }
        });
        return airplanes;
    }

    public List<Airplane> SortByFuelConsumption(List<Airplane >airplaneList) throws IOException {
        List<Airplane> airplanes = new ArrayList<Airplane>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min fuel consumption");
        int consumptionMin=sc.nextInt();
        System.out.println("Enter max fuel consumption");
        int consumptionMax=sc.nextInt();
        for(Airplane a1 :airplaneList){
            if(a1.getFuel_consumption()>=consumptionMin && a1.getFuel_consumption()<=consumptionMax){
            airplanes.add(a1);
            }

        }
        if (airplanes.size()==0){
        System.out.println("There is not Aircraft with this range consumption");
        System.in.read();
        }
        return airplanes;
    }

    public void FindAircraftByName(List<Airplane> airplaneList) throws IOException {
        String name_aircraft;
        boolean aircraft_was_found = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of aircraft which you like to search");
        if(sc.hasNextLine()){
            name_aircraft=sc.nextLine();
            for (Airplane b1: airplaneList){
                if(name_aircraft.equals(b1.getName())){
                    aircraft_was_found=true;
                    System.out.println("\n\n--------------"+b1.getName()+"--------------");
                    System.out.println("------------Speed-----------\n\t\t\t"+b1.getSpeed()+"KM/H");
                    System.out.println("------------Power----------\n\t\t\t"+b1.getPower()+"HP");
                    System.out.println("------------Volume of tank--------\n\t\t\t"+b1.getVolume_of_tank()+"l.");
                    System.out.println("------------Fuel Consumption--------\n\t\t\t"+b1.getFuel_consumption()+"l. per hour");
                    System.out.println("------------Range of flight---------\n\t\t\t"+b1.getRange_of_flight()+"KM");
                }

            }
            if(aircraft_was_found==false) System.out.println("There is not one plane that you enter to find.");
            System.in.read();
        }

    }

    public double Throughput_Airport() throws IOException {
        Scanner sc = new Scanner(System.in);
        double throughput=0;
        double avgcapacity=0;
        int airplane = 0; //Aerodrome capacity (takeoffs and landings of aircraft per hour);
        double ks=0; //coefficient of daily unevenness of aircraft movement, i.e. ratio of the maximum daily number of take-off and landing operations to the average daily for the year;
        double kg=0;//the coefficient of hourly non-uniformity of aircraft movement, i.e. the ratio of the maximum hourly number of take-off operations to the hourly average for the maximum day.
        double t_per_day =0;//number of hours of operation of the airport per day
            System.out.println("How many tons of cargo are transported daily?");
            if (sc.hasNextDouble()) {
                avgcapacity = sc.nextDouble();
            }
            System.out.println("How many takeoffs and landings of aircraft per hour?");
            if (sc.hasNextInt()) {
                airplane = sc.nextInt();
            }
             System.out.println("Enter the coefficient of daily unevenness of aircraft movement.");
            if (sc.hasNextDouble()) {
            ks = sc.nextDouble();
            }
            System.out.println("Enter the coefficient of hourly non-uniformity of aircraft movement.");
            if (sc.hasNextDouble()) {
            kg = sc.nextDouble();
            }
            System.out.println("Enter the number of hours of operation of the airport per day.");
            if (sc.hasNextDouble()) {
            t_per_day = sc.nextDouble();
            }
            if (avgcapacity<=0 || airplane<=0 || kg<=0 || ks<=0 ||t_per_day<=0){
                System.out.println("You entered an incorrect value, please repeat");
            }
            else{
            throughput=avgcapacity*airplane*((t_per_day*365)/(ks*kg));
            System.out.println("The total capacity of the airport is - "+throughput+" transportations per year");
            System.in.read();
            }
        return throughput;
    }

    public void menu(List<Airplane> airplanes, List<CargoPlane>cargoplanes) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            System.out.println("\n\nWelcome to our company 'Airline' ");
            System.out.println("This is menu of our company");
            System.out.println("1.List of aircrafts.");
            System.out.println("2.Find aircraft by name.");
            System.out.println("3.Calculate total capacity and carrying capacity of all the aircraft in the airline.");
            System.out.println("4.Sort the aircrafts by flight range (from smaller to larger).");
            System.out.println("5.Find aircraft corresponding to the specified range of fuel consumption parameters (liters per hour).");
            System.out.println("6.Calculate the total carrying capacity of all the aircraft in the airline.");
            System.out.println("7.Exit.");
            System.out.println("Enter your choice :");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                System.out.println("Invalid entering!");
            }
            switch (choice) {
                case 1:
                    ListOfAirline(airplanes);
                    break;
                case 2:
                    FindAircraftByName(airplanes);
                    break;
                case 3:
                    PowerAndCapacity(cargoplanes);
                    break;
                case 4:
                    ListOfAirline(SortByFlyingRange(airplanes));
                    break;
                case 5:
                    ListOfAirline(SortByFuelConsumption(airplanes));
                    break;
                case 6: Throughput_Airport();
                    break;
                case 7:
                    System.out.println("Thank you for using our services.");
                    break;
                default:
                    System.out.println("Please enter a valid number of menu.");
                    System.in.read();
            }
        }
    }
}
