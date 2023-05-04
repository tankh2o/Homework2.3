public class Main {
    public static void main(String[] args) {
            Car car = new Car("Лада", 4);
            Car car2 = new Car("Москвич", 4);
            car.setModelName("car1");
            car2.setModelName("car2");
            car.setWheelsCount(4);
            car2.setWheelsCount(4);

            Truck truck = new Truck("Краз", 6);
            Truck truck2 = new Truck("Камаз", 6);
            truck.setModelName("truck1");
            truck2.setModelName("truck2");
            truck.setWheelsCount(6);
            truck2.setWheelsCount(8);

            Bicycle bicycle = new Bicycle("Стрела", 2);
            Bicycle bicycle2 = new Bicycle("Гном", 3);
            bicycle.setModelName("bicycle1");
            bicycle2.setModelName("bicycle2");
            bicycle.setWheelsCount(2);
            bicycle2.setWheelsCount(2);

            ServiceStation station = new ServiceStation();
            station.check(car);
            station.check(car2);
            station.check(bicycle);
            station.check(bicycle2);
            station.check(truck);
            station.check(truck2);

            /*Car car = new Car();
            Car car2 = new Car();
            car.getModelName() = "car1";
            car2.getModelName() = "car2";
            car.getWheelsCount() = 4;
            car2.getWheelsCount() = 4;

            Truck truck = new Truck();
            Truck truck2 = new Truck();
            truck.getModelName() = "truck1";
            truck2.getModelName() = "truck2";
            truck.getWheelsCount() = 6;
            truck2.getWheelsCount() = 8;

            Bicycle bicycle = new Bicycle();
            Bicycle bicycle2 = new Bicycle();
            bicycle.getModelName() = "bicycle1";
            bicycle2.getModelName() = "bicycle2";
            bicycle.getWheelsCount() = 2;
            bicycle2.getWheelsCount() = 2;

            ServiceStation station = new ServiceStation();
            station.check(car, null, null);
            station.check(car2, null, null);
            station.check(null, bicycle, null);
            station.check(null, bicycle2, null);
            station.check(null, null, truck);
            station.check(null, null, truck2);*/
    }
}