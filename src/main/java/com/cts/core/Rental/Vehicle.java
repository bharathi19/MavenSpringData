package cts.core.Rental;

import cts.config.SpringMongoConfig;
import cts.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public abstract class Vehicle {

    public static double acRate(String actype) {

        if (actype.equalsIgnoreCase("AC"))
            return 2;
        else
            return 0;
    }


    public static double fuelRate(String fuelType) {
        if (fuelType.equalsIgnoreCase("Petrol"))
            return 9;
        else if (fuelType.equalsIgnoreCase("Diesel"))
            return 8;
        else
            return 0;
    }



    abstract double getTotalExpense(String input);
}