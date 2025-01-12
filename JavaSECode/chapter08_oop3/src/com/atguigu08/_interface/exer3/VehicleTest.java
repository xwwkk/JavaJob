package com.atguigu08._interface.exer3;

/**
 * ClassName: VehicleTest
 * Package: com.atguigu08._interface.exer3
 * Description:
 *
 * @version 1.0
 * @Auther Kevin
 * @Create 23/12/2024 下午11:11
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "red");
        vehicles[1] = new ElectricVehicle("雅迪", "blue");
        vehicles[2] = new Car("奔驰", "white", "沪Au888");

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].run();

            if(vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
