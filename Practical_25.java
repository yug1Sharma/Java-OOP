class Vehicle
{
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    Vehicle(String vno, String b, String f)
    {
        vehicleNumber = vno;
        brand = b;
        fuelType = f;
    }

    void displayDetails()
    {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle
{
    protected int numberOfSeats;
    protected boolean ACavailable;

    Car(String vno, String b, String f, int seats, boolean ac)
    {
        super(vno, b, f);
        numberOfSeats = seats;
        ACavailable = ac;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car
{
    double batteryCapacity;
    double chargingTime;

    ElectricCar(String vno, String b, String f, int seats, boolean ac,
                double battery, double time)
    {
        super(vno, b, f, seats, ac);
        batteryCapacity = battery;
        chargingTime = time;
    }

    void displayDetails()
    {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
        System.out.println("Charging Time: " + chargingTime);
    }
}

class Practical_25
{
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle("GJ01AB1234", "Tata", "Petrol");
        Car c = new Car("GJ02CD5678", "Honda", "Diesel", 5, true);
        ElectricCar e = new ElectricCar("GJ03EF9999", "Tesla", "Electric", 5, true, 75, 1.5);

        System.out.println("Vehicle Details:");
        v.displayDetails();

        System.out.println("\nCar Details:");
        c.displayDetails();

        System.out.println("\nElectric Car Details:");
        e.displayDetails();

        // Upcasting
        Vehicle v2 = new Car("GJ04XY1111", "Hyundai", "Petrol", 5, true);
        System.out.println("\nUpcasting (Vehicle reference, Car object):");
        v2.displayDetails();

        // Downcasting with instanceof
        if (v2 instanceof Car)
        {
            Car c2 = (Car) v2;
            System.out.println("\nDowncasting successful:");
            System.out.println("Seats: " + c2.numberOfSeats);
        }
    }
}