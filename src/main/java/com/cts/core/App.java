package cts.core;

import cts.config.SpringMongoConfig;
import cts.model.City;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;
import java.util.Scanner;

public class App {

    public static double calculateDistance(String city) {


        // For XML
        //ApplicationContext ctx = new GenericXmlApplicationContext("SpringConfig.xml");

        // For Annotation
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

        City city1 = new City("Pune", 0);
        City city2 = new City("Mumbai", 200);
        City city3 = new City("Bangalore", 1000);
        City city4 = new City("Delhi", 2050);
        City city5 = new City("Chennai", 1234.5);


        // save
        mongoOperation.save(city1);
        mongoOperation.save(city2);
        mongoOperation.save(city3);
        mongoOperation.save(city4);
        mongoOperation.save(city5);





            String splitCityName[] = city.split("-");

            String departure = splitCityName[0];
            String destination = splitCityName[1];

            Query searchCityQuery1= new Query(Criteria.where("cityName").is(departure) );

            // find the saved user again.
            City savedcity1 = mongoOperation.findOne(searchCityQuery1, City.class);

            double distance1 = savedcity1.getDistance();


            Query searchCityQuery2= new Query(Criteria.where("cityName").is(destination) );
        City savedcity2 = mongoOperation.findOne(searchCityQuery2, City.class);

        double distance2 = savedcity2.getDistance();

        return distance1+distance2;




    }

}