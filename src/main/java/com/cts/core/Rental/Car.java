package cts.core.Rental;


import cts.core.App;

public class  Car extends Vehicle{
    @Override
    double getTotalExpense(String input) {

        double output = 0.0;
        String splitInput[] = input.split(" ");
        String vehicleName = splitInput[0];
        String fuelType = splitInput[1];
        String acType = splitInput[2];
        String city = splitInput[3];


        double distance = App.calculateDistance(city);
        double fuelRate =Vehicle.fuelRate(fuelType);
        double acRate = Vehicle.acRate(acType);
        double busDiscount = Bus.busDiscount(vehicleName);


        if (vehicleName.equalsIgnoreCase("car"))
            output = distance * (fuelRate + acRate);
        return output;

    }
}