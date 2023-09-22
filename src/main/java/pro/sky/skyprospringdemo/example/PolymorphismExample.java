package pro.sky.skyprospringdemo.example;

import pro.sky.skyprospringdemo.domain.Driver;
import pro.sky.skyprospringdemo.domain.TruckDriver;

public class PolymorphismExample {
    public static void main(String[] args) {

        Driver driver = new TruckDriver(
                "Ivan",
                "Petrov",
                "12345678",
                "244", 1);
        driver.setDriverLicenseNumber("277");
        System.out.println("driver.getDriverLicenseNumber() = " + driver.getDriverLicenseNumber());
    }
}
