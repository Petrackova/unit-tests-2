package seminars.second.hw;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;


class VehicleTest {
    Car car = new Car("Dodge", "Ram", 2010);
    Motorcycle moto = new Motorcycle("Yokohama", "YZF-R150 1CK0", 2013);
    @Test
    @DisplayName("Проверить, что экземпляр объекта Car также является экземпляром транспортного средства")
    public void testCarIsInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    @DisplayName("Проверить, что объект Car создается с 4-мя колесами.")
    public void wheelsCarHasFour() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    @DisplayName("Проверить, что объект Motorcycle создается с 2-мя колесами.")
    public void wheelsMotorcycleHasTwo() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }
    @Test
    @DisplayName("Проверить, что объект Car развивает скорость 60 в режиме тестового вождения ")
    public void speedCarTesting() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    @DisplayName("Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения ")
    public void speedMotorcycleTesting() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }
    @Test
    @DisplayName("Проверить, что в режиме парковки мотоцикл останавливается ")
    public void speedParkingMotorcycleTesting() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
    @Test
    @DisplayName("Проверить, что в режиме парковки машина останавливается ")
    public void speedParkingCarTesting() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}