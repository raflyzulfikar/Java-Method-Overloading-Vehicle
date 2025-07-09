# Activity 2: Implementing Method Overloading (OOP Java)
## Project Description
This project focuses on demonstrating **Method Overloading** in Java within an Object-Oriented Programming (OOP) context. The primary goal is to illustrate how a single method name (`fuelUp()`) can have multiple distinct implementations based on the number or type of its parameters.
The program extends the `Vehicle` class by adding various versions of a `fuelUp()` method. This allows for flexible handling of different fueling scenarios, observing how the method's behavior changes with different parameters in a real-world context.
*(Please note: Some parts of the codebase, including variable names, are written in Indonesian for clarity among local developers.)*
## Key OOP Concepts Utilized
* **Method Overloading**
    * The `Vehicle` class prominently features `fuelUp()` method overloading with three distinct signatures:
        * `fuelUp(int liter)`: For specifying the amount of fuel in liters.
        * `fuelUp(String fuelType)`: For changing the type of fuel.
        * `fuelUp(int liter, boolean isFullTank)`: For either partial fueling or filling the tank to full capacity.
    * This demonstrates how methods with the same name can perform different operations based on their parameter lists.
* **Inheritance**
    * The `Car` class extends `Vehicle`, inheriting its properties and methods, including the overloaded `fuelUp()` methods.
* **Encapsulation**
    * Attributes like `brand`, `model`, `year`, `fuelType`, and `tankCapacity` in the `Vehicle` class are `protected` (allowing access by subclasses), and getter        methods are provided for some, promoting controlled access to the object's state.
## Class Structure
This project consists of two main classes:
### `Vehicle.java`
* **Purpose:** The superclass representing the basic properties and behaviors of all types of vehicles, with a focus on fuel management.
* **Attributes:**
    * `protected String brand`: Vehicle's brand.
    * `protected String model`: Vehicle's model.
    * `protected int year`: Manufacturing year.
    * `protected String fuelType`: Type of fuel the vehicle uses.
    * `protected int tankCapacity`: Maximum fuel tank capacity in liters.
* **Constructor:** `public Vehicle(String brand, String model, int year, String fuelType, int tankCapacity)`
* **Methods:**
    * `public void move()`: General vehicle movement method (overridden by subclasses).
    * `public void displayInfo()`: Displays basic vehicle information including fuel type.
    * `public void fuelUp(int liter)`: **Overloaded Method 1** Fills a specified amount of fuel. Includes a warning if exceeding tank capacity.
    * `public void fuelUp(String fuelType)`: **Overloaded Method 2** Changes the vehicle's fuel type.
    * `public void fuelUp(int liter, boolean isFullTank)`: **Overloaded Method 3** Fills a specified amount or fills the tank completely based on `isFullTank`           flag.
    * `public String getFuelType()`: Getter for fuel type.
    * `public int getTankCapacity()`: Getter for tank capacity.
### `Car.java`
* **Purpose:** Represents a car vehicle type, inheriting features from `Vehicle`.
* **Inherits from:** `Vehicle`
* **Additional Attributes:** `numberOfDoors` (int).
* **Constructor:** `public Car(String brand, String model, int year, String fuelType, int tankCapacity, int numberOfDoors)`
* **Overridden Method:**
    * `@Override public void move()`: Displays a car-specific movement message.
* **Additional Method:** `public void honk()`: Simulates honking.
### `Main.java`
* **Purpose:** The entry point of the program. Demonstrates the various `fuelUp()` overloads and other methods.
* **Main Content:**
    * Creates an instance of `Car`.
    * Calls `displayInfo()`.
    * Demonstrates `fuelUp()`:
        * Filling a specific amount (e.g., 30 liter).
        * Changing fuel type (e.g., to "Pertamax Turbo").
        * Filling to full capacity.
        * Attempting to fill exceeding capacity.
## Project Structure
This project is organized with a standard Java folder structure:
```
.
├── src/
│   ├── Vehicle.java
│   ├── Car.java
│   └── Main.java
└── README.md
```
## Usage Example (Console Output)
Here is an example of the program output in the console when executed:
```
Merk: Toyota, Model: Avanza, Tahun: 2022, Bahan Bakar: Pertamax
Kapasitas tangki: 40 liter

1. Mengisi bahan bakar 30 liter:
Mengisi 30 liter Pertamax ke Toyota Avanza

2. Mengganti jenis bahan bakar:
Mengganti bahan bakar Toyota Avanza menjadi Pertamax Turbo
Merk: Toyota, Model: Avanza, Tahun: 2022, Bahan Bakar: Pertamax Turbo

3. Mengisi penuh tangki:
Mengisi penuh tangki (40 liter) Pertamax Turbo ke Toyota Avanza

4. Mengisi 50 liter (melebihi kapasitas):
Mengisi 50 liter Pertamax Turbo ke Toyota Avanza
Peringatan: Jumlah melebihi kapasitas tangki!
```
## How to Run the Project
To run this program, you need to have the Java Development Kit (JDK) installed on your system.
1.  **Prepare Files**
    Ensure all `.java` files are located in the `src/` folder within your project directory.
2.  **Compile Code**
    Open your terminal or Command Prompt, navigate to the root directory of your project (the folder where `src/` and `README.md` are located), and compile all        Java files:
    ```
    javac src/*.java
    ```
3.  **Run the Program**
    Once successfully compiled, you can run the program:
    ```
    java -cp src Main
    ```
## Important Notes and Potential Enhancements
* **Further Encapsulation:** Attributes using `protected` in `Vehicle` (like `brand`, `model`, `year`, `fuelType`, and `tankCapacity`) could be made `private` and accessed through `public` getter and setter methods for stricter encapsulation, which is a core OOP principle for better data control.
* **Robust Error Handling in `fuelUp`:** While there's a warning for exceeding tank capacity, consider adding more robust error handling for the `fuelUp` methods (e.g., preventing negative fuel amounts as input, or validating `fuelType` strings against a predefined list).
* **Polymorphism Demonstration:** This project effectively demonstrates method overloading. For a broader OOP demonstration, one could also include subclasses (e.g., `Motorcycle`, `Truck`) and store them in a `List<Vehicle>`, then call shared methods like `move()` polymorphically to illustrate different behaviors at runtime.
* **Dynamic Data:** The `tankCapacity` is currently static per object. For a more dynamic system, this could be loaded from configuration or determined based on vehicle model.
