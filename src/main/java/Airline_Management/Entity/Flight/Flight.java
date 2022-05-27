package Airline_Management.Entity.Flight;

import Airline_Management.Entity.Airport;

import java.util.List;

public class Flight {

    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;

    private List<WeeklySchedule> weeklySchedules;
    private List<CustomSchedule> customSchedules;
    private List<FlightInstance> flightInstances;

}
