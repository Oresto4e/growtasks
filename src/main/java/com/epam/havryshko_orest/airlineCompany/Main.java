package com.epam.havryshko_orest.airlineCompany;

import java.util.Arrays;
import java.util.List;

public class Main {

    static List<Airplane> planes = Arrays.asList(
            new PassengerPlane("Boeing 777-200", 905, 247210, 6020, 705 ),
            new PassengerPlane("Boeing 777-200ER", 905, 297560, 10470, 701 ),
            new PassengerPlane("Boeing 777-300", 905, 299370, 7035, 819 ),
            new PassengerPlane("Airbus A300", 850, 150000, 5300, 345 ),
            new PassengerPlane("Airbus A300-600R", 875, 165000, 7000, 361 ),
            new CargoPlane("AN-124", 850, 120000, 5000),
            new CargoPlane("CASA C-295", 482, 9250, 1300),
            new CargoPlane("Boeing 777-300", 912, 112630, 13450));

    public static void main(String[] args) {
        AirlineCompany airlineCompany = new AirlineCompany(planes);

        System.out.println("Cargo capacity of all cargo planes: " + airlineCompany.calculateAllCargoCapacity(airlineCompany.getCompanyCargoPlanes()));
        System.out.println("Cargo capacity of all passenger planes: " + airlineCompany.calculateAllCargoCapacity(airlineCompany.getCompanyPassengerPlanes()));
        System.out.println("Seats capacity of all passenger planes: " + airlineCompany.calculateAllPassengersSeats(airlineCompany.getCompanyPassengerPlanes()));
        airlineCompany.sortPassengerPlanesByMaxFlightDistance();
        System.out.println("Passenger planes sorted by flight distance: ");
        airlineCompany.printPassengersPlanes();
        airlineCompany.sortCargoPlanesByMaxFlightDistance();
        System.out.println("Cargo planes sorted by flight distance: ");
        airlineCompany.printCargoPlanes();
    }
}
