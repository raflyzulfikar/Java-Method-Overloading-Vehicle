public class Car extends Vehicle {
        int numberOfDoors;
    
        public Car(String brand, String model, int year, String fuelType, 
                   int tankCapacity, int numberOfDoors) {
            super(brand, model, year, fuelType, tankCapacity);
            this.numberOfDoors = numberOfDoors;
        }
    
        @Override
        public void move() {
            System.out.println("Mobil " + brand + " " + model + " melaju di jalan raya");
        }
    
        public void honk() {
            System.out.println("Tin tin!");
        }
    }

