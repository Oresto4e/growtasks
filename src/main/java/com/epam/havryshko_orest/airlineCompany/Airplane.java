package com.epam.havryshko_orest.airlineCompany;

abstract public class Airplane {
    private String modelName;
    private int speed;
    private int cargoCapacity;
    private int flightDistance;

    public Airplane(String modelName, int speed, int cargoCapacity, int flightDistance) {
        this.modelName = modelName;
        this.speed = speed;
        this.cargoCapacity = cargoCapacity;
        this.flightDistance = flightDistance;
    }

    public String getModelName() {
        return modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    @Override
    public String toString() {
        return "Airplane:" +
                "modelName='" + modelName + '\'' +
                ", speed=" + speed +
                ", cargoCapacity=" + cargoCapacity +
                ", flightDistance=" + flightDistance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Airplane airplane = (Airplane) obj;
        if ((speed == airplane.speed) &&
                (flightDistance == airplane.flightDistance) &&
                (cargoCapacity == airplane.cargoCapacity) &&
                (modelName.equals(airplane.modelName))) {
            return true;
        } else {
            return false;
        }
    }
}
