public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Avanza", 2022, "Pertamax", 40, 4);
        
        myCar.displayInfo();
        System.out.println("Kapasitas tangki: " + myCar.getTankCapacity() + " liter\n");
        
        System.out.println("1. Mengisi bahan bakar 30 liter:");
        myCar.fuelUp(30);
        
        System.out.println("\n2. Mengganti jenis bahan bakar:");
        myCar.fuelUp("Pertamax Turbo");
        myCar.displayInfo();
        
        System.out.println("\n3. Mengisi penuh tangki:");
        myCar.fuelUp(0, true);
        
        System.out.println("\n4. Mengisi 50 liter (melebihi kapasitas):");
        myCar.fuelUp(50);
    }
}