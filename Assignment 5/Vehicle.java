class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }

    void stop() {
        System.out.println("Vehicle stops");
    }
}

class Car extends Vehicle {
    void displayType() {
        System.out.println("Car");
    }
}

class Bike extends Vehicle {
    void displayType() {
        System.out.println("Bike");
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.displayType();
        c.stop();

        Bike b = new Bike();
        b.start();
        b.displayType();
        b.stop();
    }
}
