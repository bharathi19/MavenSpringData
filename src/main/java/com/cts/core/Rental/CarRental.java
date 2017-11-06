package cts.core.Rental;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarRental {




    public static void main(String args[]) throws IOException{

        VehicleFactory vehicleFactory = new VehicleFactory();


        System.out.println("Car Diesel NON_AC Pune-Mumbai");
        Vehicle vehicle1 = vehicleFactory.getVehicle("Car");
        System.out.println("Total Expense: " + vehicle1.getTotalExpense("Car Diesel NON_AC Pune-Mumbai"));


        System.out.println("SUV Mumbai-Bangalore");
        Vehicle vehicle2 = vehicleFactory.getVehicle("SUV");
        System.out.println("Total Expense: " + vehicle2.getTotalExpense("SUV Mumbai-Bangalore"));


        System.out.println("Bus AC Mumbai-Bangalore");
        Vehicle vehicle3 = vehicleFactory.getVehicle("Bus");
        System.out.println("Total Expense: " + vehicle3.getTotalExpense("Bus AC Mumbai-Bangalore"));



//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String journeyDetail=br.readLine();
//        String splitJourneyDetail[]=journeyDetail.split(" ");
//        String vehicleName=splitJourneyDetail[0];
//        Vehicle vehicle4=vehicleFactory.getVehicle(vehicleName);
//        System.out.println("Total Expense: "+vehicle1.getTotalExpense(journeyDetail));


    }
}