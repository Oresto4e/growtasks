package com.epam.havryshko_orest.airlineCompany;

import java.util.*;

public class AirlineCompany {

    private List<PassengerPlane> companyPassengerPlanes;
    private List<CargoPlane> companyCargoPlanes;

    public AirlineCompany(List<? extends Airplane> airplanes) {
        companyCargoPlanes = new ArrayList<CargoPlane>();
        companyPassengerPlanes = new ArrayList<PassengerPlane>();

        for (Airplane airplane : airplanes) {
            if (airplane instanceof PassengerPlane) {
                companyPassengerPlanes.add((PassengerPlane) airplane);
            }
            if (airplane instanceof CargoPlane) {
                companyCargoPlanes.add((CargoPlane) airplane);
            }
        }
    }

    public List<PassengerPlane> getCompanyPassengerPlanes() {
        return companyPassengerPlanes;
    }

    public List<CargoPlane> getCompanyCargoPlanes() {
        return companyCargoPlanes;
    }

    public AirlineCompany sortPassengerPlanesByMaxFlightDistance() {
        Collections.sort(companyPassengerPlanes, new Comparator<PassengerPlane>() {
            public int compare(PassengerPlane o1, PassengerPlane o2) {
                return o1.getFlightDistance() - o2.getFlightDistance();
            }
        });
        return this;
    }

    public AirlineCompany sortCargoPlanesByMaxFlightDistance() {
        Collections.sort(companyCargoPlanes, new Comparator<CargoPlane>() {
            public int compare(CargoPlane o1, CargoPlane o2) {
                return o1.getFlightDistance() - o2.getFlightDistance();
            }
        });
        return this;
    }

    public int calculateAllCargoCapacity(List<? extends Airplane> airplanes) {
        int totalCargo = 0;
        for (Airplane airplane : airplanes) {
            totalCargo += airplane.getCargoCapacity();
        }
        return totalCargo;
    }

    public int calculateAllPassengersSeats(List<PassengerPlane> passengerPlanes) {
        int totalSeats = 0;
        for (PassengerPlane passengerPlane : passengerPlanes) {
            totalSeats += passengerPlane.getPassengersSeats();
        }
        return totalSeats;
    }

    public void printPassengersPlanes(){
        Iterator<PassengerPlane> iterator = companyPassengerPlanes.iterator();
        while (iterator.hasNext()){
            PassengerPlane passengerPlane = iterator.next();
            System.out.println(passengerPlane);
        }
    }

    public void printCargoPlanes(){
        Iterator<CargoPlane> iterator = companyCargoPlanes.iterator();
        while (iterator.hasNext()){
            CargoPlane cargoPlane = iterator.next();
            System.out.println(cargoPlane);
        }
    }

    @Override
    public String toString() {
        return "AirlineCompany planes: " + companyPassengerPlanes.toString() + " " + companyCargoPlanes.toString();
    }
}
