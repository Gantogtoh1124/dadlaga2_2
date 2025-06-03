// Vehicle.java
// Abstract base class representing a generic vehicle

/**
 * Abstract class representing a general vehicle with common attributes.
 */
public abstract class Vehicle {
    
    // Instance variables
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    /**
     * Constructor to initialize a vehicle with the given attributes.
     *
     * @param make            the manufacturer of the vehicle
     * @param model           the model name of the vehicle
     * @param year            the year the vehicle was made
     * @param fuelType        the type of fuel the vehicle uses
     * @param fuelEfficiency  the fuel efficiency (e.g., km/L or mpg)
     */
    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    // Getter methods

    /** @return the make (manufacturer) of the vehicle */
    public String getMake() {
        return make;
    }

    /** @return the model of the vehicle */
    public String getModel() {
        return model;
    }

    /** @return the manufacturing year of the vehicle */
    public int getYear() {
        return year;
    }

    /** @return the fuel type (e.g., Petrol, Diesel, Electric) */
    public String getFuelType() {
        return fuelType;
    }

    /** @return the fuel efficiency value */
    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    // Abstract methods to be implemented by subclasses

    /**
     * Calculate and return the fuel efficiency of the vehicle (can vary per subclass).
     * @return fuel efficiency
     */
    public abstract double calculateFuelEfficiency();

    /**
     * Calculate and return the distance traveled (could depend on time, speed, etc.).
     * @return distance traveled
     */
    public abstract double calculateDistanceTraveled();

    /**
     * Get the maximum speed the vehicle can reach.
     * @return max speed
     */
    public abstract double getMaxSpeed();
}
