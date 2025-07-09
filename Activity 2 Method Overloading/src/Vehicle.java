public class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected String fuelType;
    protected int tankCapacity; 

    public Vehicle(String brand, String model, int year, String fuelType, int tankCapacity) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.tankCapacity = tankCapacity;
    }

    public void move() {
        System.out.println("Kendaraan bergerak");
    }

    public void displayInfo() {
        System.out.println("Merk: " + brand + ", Model: " + model + 
                         ", Tahun: " + year + ", Bahan Bakar: " + fuelType);
    }

    public void fuelUp(int liter) {
        System.out.println("Mengisi " + liter + " liter " + fuelType + 
                         " ke " + brand + " " + model);
        
        if (liter > tankCapacity) {
            System.out.println("Peringatan: Jumlah melebihi kapasitas tangki!");
        }
    }

    public void fuelUp(String fuelType) {
        this.fuelType = fuelType;
        System.out.println("Mengganti bahan bakar " + brand + " " + model + 
                         " menjadi " + fuelType);
    }

    public void fuelUp(int liter, boolean isFullTank) {
        if (isFullTank) {
            System.out.println("Mengisi penuh tangki (" + tankCapacity + 
                             " liter) " + fuelType + " ke " + brand + " " + model);
        } else {
            fuelUp(liter); 
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}

