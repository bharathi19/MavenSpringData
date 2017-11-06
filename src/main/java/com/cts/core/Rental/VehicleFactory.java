package cts.core.Rental;

public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleName) {


        if (vehicleName == null)
            return null;
        if (vehicleName.equalsIgnoreCase("Car"))
            return new Car();
        if (vehicleName.equalsIgnoreCase("SUV"))
            return new SUV();
        if (vehicleName.equalsIgnoreCase("Bus"))
            return new Bus();
        return null;

    }
}