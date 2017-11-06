package cts.core.Rental;

import cts.core.App;

public  class SUV extends Vehicle {


    @Override
    double getTotalExpense(String input) {
        double output = 0.0;
        String splitInput[] = input.split(" ");
        String vehicleName = splitInput[0];
        String city = splitInput[1];


        double distance = App.calculateDistance(city);
        double fuelRate = Vehicle.fuelRate("Diesel");
        double acRate = Vehicle.acRate("AC");
        double busDiscount = Bus.busDiscount(vehicleName);


        if (vehicleName.equalsIgnoreCase("SUV"))
            output = distance * (fuelRate + acRate);


        return output;

    }
}








