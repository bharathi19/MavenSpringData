package cts.core.Rental;

import cts.core.App;

public class Bus extends Vehicle {
    public static double busDiscount(String vehicleName) {
        if (vehicleName.equalsIgnoreCase("Bus"))
            return 0.02;
        else
            return 0;
    }

    @Override
    double getTotalExpense(String input) {
        double output = 0.0;
        String splitInput[] = input.split(" ");
        String vehicleName = splitInput[0];
        String acType = splitInput[1];
        String city = splitInput[2];


        double distance = App.calculateDistance(city);
        double fuelRate =Vehicle.fuelRate("Diesel");
        double acRate = Vehicle.acRate(acType);

        double busDiscount = Bus.busDiscount(vehicleName);


        //double acRate=Vehicle.acRate(getAC);


        if (vehicleName.equalsIgnoreCase("Bus"))

            output = (distance * (fuelRate+ acRate)) * (1 - busDiscount);
        return output;

    }

}








