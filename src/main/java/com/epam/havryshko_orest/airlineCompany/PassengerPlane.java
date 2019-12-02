package com.epam.havryshko_orest.airlineCompany;

public class PassengerPlane extends Airplane {

    private int passengersSeats;

    public PassengerPlane(String modelName, int speed, int cargoCapacity, int flightDistance, int passengersSeats) {
        super(modelName, speed, cargoCapacity, flightDistance);
        this.passengersSeats = passengersSeats;
    }

    public int getPassengersSeats() {
        return passengersSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengersSeats=" + passengersSeats;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        else {
            PassengerPlane passengerPlane = (PassengerPlane) obj;
            if (passengersSeats == passengerPlane.passengersSeats){
                return true;
            } else{
                return false;
            }
        }
    }
}
