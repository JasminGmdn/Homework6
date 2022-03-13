package Task1;

public  class Vehicle {

    public static class Wheel {
        private String color;
    }

    public static class Door{
        private String color;
    }

    void printWheelColor() {
        System.out.println("Wheel color is - black;");
    }

    void printDoorColor() {
        System.out.println("Door color is - grey.");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();


        vehicle.printWheelColor();
        vehicle.printDoorColor();


    }
}
